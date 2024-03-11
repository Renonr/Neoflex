package ru.neoflex.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ru.neoflex.practice.model.Calc;
import ru.neoflex.practice.repository.CalcRepository;

import java.util.List;

@RestController
@SpringBootApplication
public class CalcController {

    @Autowired
    private  CalcRepository calcRepository;

    @GetMapping("/plus/{a}/{b}")
    public Integer plus(@PathVariable("a") int a, @PathVariable("b") int b) {
        Calc calc = new Calc();
        calc.set_a(a);
        calc.set_b(b);
        calc.set_res(a+b);
        calc.set_operation("+");
        calcRepository.save(calc);

        return a+b;
    }

    @GetMapping("/minus/{a}/{b}")
    public Integer minus(@PathVariable("a") int a, @PathVariable("b") int b) {
        Calc calc = new Calc();
        calc.set_a(a);
        calc.set_b(b);
        calc.set_res(a-b);
        calc.set_operation("-");
        calcRepository.save(calc);

        return a-b;
    }

    @GetMapping("/calc_results")
    public List< Calc > getAllResults() {
        return calcRepository.findAll();
    }
}