package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор!";
    }

    public String additionCalculator(Integer numberOne, Integer numberTwo) {
        int result = numberOne + numberTwo;
            return "Результат сложения " + numberOne + " и " + numberTwo + " равен " + result;
    }

    public String subtractionCalculator(Integer numberOne, Integer numberTwo) {
        int result = numberOne - numberTwo;
            return "Результат вычитания " + numberOne + " и " + numberTwo + " равен " + result;
    }

    public String multiplicationCalculator(Integer numberOne, Integer numberTwo) {
        int result = numberOne * numberTwo;
            return "Результат умножения " + numberOne + " и " + numberTwo + " равен " + result;
    }

    public String divisionCalculator(Integer numberOne, Integer numberTwo) {
        Integer result = numberOne / numberTwo;
        return "Результат деления " + numberOne + " и " + numberTwo + " равен " + result;
    }
}
