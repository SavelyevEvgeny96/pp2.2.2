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
    private Integer forIndex;
    private Integer toIndex;

    @GetMapping(value = "/cars")
    public String printCarsList(@RequestParam(defaultValue = "6") Integer forIndex,Integer toIndex, Model model) {
        this.forIndex = forIndex;
        this.toIndex = toIndex;
        model.addAttribute("cars", carsService.getCarList(forIndex,toIndex));
        return "cars";
    }
}