package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsServiceImpl;

@Controller
public class CarsController {
    @Autowired
    CarsServiceImpl carsService;

    @GetMapping(value = "/cars")
    public String printCarsList(@RequestParam(value="count", required=false, defaultValue= "6") Integer count, Model model) {
        model.addAttribute("cars", carsService.getCars(count));
        return "cars";
    }
}