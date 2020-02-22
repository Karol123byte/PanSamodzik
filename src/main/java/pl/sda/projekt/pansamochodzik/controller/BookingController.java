package pl.sda.projekt.pansamochodzik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.sda.projekt.pansamochodzik.Service.CarService;

@Controller
public class BookingController {
    CarService carService;

    public BookingController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("/car/book")
    public void book (@RequestParam int carId, @RequestParam int userId){
        carService.reserve(carId, userId);
    }
}
