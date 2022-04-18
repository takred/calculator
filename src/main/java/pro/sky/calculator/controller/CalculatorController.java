package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @RequestMapping("/plus")
    public String addition(@RequestParam(required = false, name = "num1") Integer num1,
                           @RequestParam(required = false, name = "num2") Integer num2) {
        try {
            return calculatorService.plus(num1, num2);
        } catch (NullPointerException e) {
            return "Один или оба элемента пусты!";
        }
    }

    @RequestMapping("/minus")
    public String subtraction(@RequestParam(required = false, name = "num1") Integer num1,
                              @RequestParam(required = false, name = "num2") Integer num2) {
        try {
            return calculatorService.minus(num1, num2);
        } catch (NullPointerException e) {
            return "Один или оба элемента пусты!";
        }
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam(required = false, name = "num1") Integer num1,
                           @RequestParam(required = false, name = "num2") Integer num2) {
        try {
            return calculatorService.multiply(num1, num2);
        } catch (NullPointerException e) {
            return "Один или оба элемента пусты!";
        }
    }

    @RequestMapping("/divide")
    public String divide(@RequestParam(required = false, name = "num1") Integer num1,
                         @RequestParam(required = false, name = "num2") Integer num2) {
        try {
            return calculatorService.divide(num1, num2);
        } catch (NullPointerException e) {
            return "Один или оба элемента пусты!";
        }
    }
}
