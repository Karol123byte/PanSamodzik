package pl.sda.projekt.pansamochodzik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.projekt.pansamochodzik.entity.Car;

@SpringBootApplication
public class PansamochodzikApplication extends Car {

    public static void main(String[] args) {
        SpringApplication.run(PansamochodzikApplication.class, args);
    }

    private PansamochodzikApplication crateaCar(Car car) {
        return this;
    }
}
