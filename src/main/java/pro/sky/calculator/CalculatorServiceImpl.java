package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор!";
    }

    public String additionCalculator(Integer numberOne, Integer numberTwo) {
        int result = numberOne + numberTwo;
        if (numberOne == null || numberTwo == null) {
            return "Ошибка! Один из параметров пустой!";
        } else {
            return "Результат сложения " + numberOne + " и " + numberTwo + " равен " + result;
        }
    }

    public String subtractionCalculator(Integer numberOne, Integer numberTwo) {
        int result = numberOne - numberTwo;
        if (numberOne == null || numberTwo == null) {
            return "Ошибка! Один из параметров пустой!";
        } else {
            return "Результат вычитания " + numberOne + " и " + numberTwo + " равен " + result;
        }
    }

    public String multiplicationCalculator(Integer numberOne, Integer numberTwo) {
        int result = numberOne * numberTwo;
        if (numberOne == null || numberTwo == null) {
            return "Ошибка! Один из параметров пустой!";
        } else {
            return "Результат умножения " + numberOne + " и " + numberTwo + " равен " + result;
        }
    }

    public String divisionCalculator(Integer numberOne, Integer numberTwo) {
        int result = numberOne / numberTwo;
        if (numberOne == 0 || numberTwo == 0) {
            return "Ошибка! Деление на ноль запрещено!";
        } else if (numberOne == null || numberTwo == null) {
            return "Ошибка! Один из параметров пустой!";
        } else {
            return "Результат деления " + numberOne + " и " + numberTwo + " равен " + result;
        }
    }
}
