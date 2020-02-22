package pl.sda.projekt.pansamochodzik.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.projekt.pansamochodzik.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    }

