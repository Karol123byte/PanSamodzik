package pl.sda.projekt.pansamochodzik.Service;

import org.springframework.stereotype.Service;
import pl.sda.projekt.pansamochodzik.Repository.CarRepository;
import pl.sda.projekt.pansamochodzik.Repository.UserRepository;
import pl.sda.projekt.pansamochodzik.entity.Car;
import pl.sda.projekt.pansamochodzik.entity.User;

import java.util.List;

@Service
public class CarService {
    private CarRepository carRepository;
    private UserRepository userRepository;

    public CarService(CarRepository carRepository, UserRepository userRepository) {
        this.carRepository = carRepository;
        this.userRepository = userRepository;
    }

    public void saveBrandModel(String marka, String model) {
        Car car = new Car();
        car.setMarka(String.format("%s - %s", marka, model));
        carRepository.save(car);
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public void reserve(int carId, int userId) {
        Car car = carRepository.findById(carId).orElseThrow(() -> new RuntimeException());
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException());
        if (!car.getBooked()) {
            car.setBooked(true);
            car.setUser(user);
        } else {
            throw new RuntimeException("nie udało się zarezerwować");
        }
    }
}
