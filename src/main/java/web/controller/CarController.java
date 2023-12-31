package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;


@Controller
public class CarController {

    public final CarServiceImpl carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(required = false) Integer count, Model model) {
        if ((count != null)) {
            model.addAttribute("cars", carService.getCars(count));
        } else {
            model.addAttribute("cars", carService.getAllCars());
        }
        return "cars";
    }
}
