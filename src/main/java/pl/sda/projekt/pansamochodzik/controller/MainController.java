package pl.sda.projekt.pansamochodzik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping("/panSamochodzik")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");

        return modelAndView;
    }

   /* @GetMapping("/panSamochodzik")
    public ModelAndView reservation() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("panSamochodzik");

        return modelAndView;*/
    }
