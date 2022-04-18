package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        int plus = num1 + num2;
        return num1 + " + " + num2 + " = " + plus;
    }

    public String minus(int num1, int num2) {
        int minus = num1 - num2;
        return num1 + " - " + num2 + " = " + minus;
    }

    public String multiply(int num1, int num2) {
        int multiply = num1 * num2;
        return num1 + " * " + num2 + " = " + multiply;
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "Делить на 0 нельзя!";
        }
        int multiply = num1 / num2;
        return num1 + " / " + num2 + " = " + multiply;
    }
}
