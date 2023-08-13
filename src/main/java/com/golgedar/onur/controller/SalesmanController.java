package com.golgedar.onur.controller;

import com.golgedar.onur.entity.Salesman;
import com.golgedar.onur.service.SalesmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

// 300365517
// https://github.com/onurgolgedar/GolgedarOnurFinal

@Controller
public class SalesmanController {

    @Autowired
    private SalesmanService salesmanService;

    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    @GetMapping("/salesman")
    public String showSalesmen(Model model) {
        model.addAttribute("transactions", salesmanService.findAll());
        return "index";
    }

    @PostMapping("/salesman")
    public String saveSalesman(@ModelAttribute Salesman salesman) {
        // Everything looks fine but it does not work!
        System.out.println(salesman);
        salesmanService.save(salesman);
        return "index";
    }

}