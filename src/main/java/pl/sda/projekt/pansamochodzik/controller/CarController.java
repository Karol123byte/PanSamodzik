package pl.sda.projekt.pansamochodzik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.projekt.pansamochodzik.Repository.CarRepository;
import pl.sda.projekt.pansamochodzik.entity.Car;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestController wszystko z tej klasy będzie zwracane w jsonie
@Controller
@RequestMapping("/cars")
public class CarController {
    private CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping ("/carsList")
    public ModelAndView getCars() {
        Map<String, List<Car>> someCar = new HashMap<>();
        someCar.put("cars", carRepository.findAll());
        return new ModelAndView ("carsList", someCar);
    }

    @PostMapping//służy do zapisywania do db
    public ModelAndView addCar(@ModelAttribute Car car) {
        carRepository.save(car);
      //  Map<String, Object> newCar = new HashMap<>();
       // newCar.put("created", car);
        return new ModelAndView("redirect:/cars/carsList");
    }

    @GetMapping
    public ModelAndView getSaveCar() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addCar");
        Car xxx = new Car();
       // xxx.setMarka("fef");
        modelAndView.getModel().put("car", xxx);

        return modelAndView;
    }


}
   /* @PostMapping("/save")
    public ModelAndView postSaveProduct(@ModelAttribute Car car) {
        carRepository.save(product);
        Map<String, Object> model = new HashMap<>();
        model.put("created", product);
        return new ModelAndView("productCreated", model);*/

    /*   @PostMapping ("/cars")//służy do zapisywania do db
       public ModelAndView carSubmit (@ModelAttribute Car car) {
           return "car";* -> nie działa
       }*/

