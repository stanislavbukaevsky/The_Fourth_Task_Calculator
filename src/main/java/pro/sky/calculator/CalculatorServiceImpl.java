package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор!";
    }
    @Override
    public String additionCalculator(Integer numberOne, Integer numberTwo) {
        int result = numberOne + numberTwo;

        if (numberOne == null || numberTwo == null) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                return "Ошибка! Один из параметров пустой!";
            }
        }
        return "Результат сложения " + numberOne + " и " + numberTwo + " равен " + result;
    }

    public String subtractionCalculator(Integer numberOne, Integer numberTwo) {
        int result = numberOne - numberTwo;

        if (numberOne == null || numberTwo == null) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                return "Ошибка! Один из параметров пустой!";
            }
        }
        return "Результат вычитания " + numberOne + " и " + numberTwo + " равен " + result;
    }

    public String multiplicationCalculator(Integer numberOne, Integer numberTwo) {
        int result = numberOne * numberTwo;

        if (numberOne == null || numberTwo == null) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                return "Ошибка! Один из параметров пустой!";
            }
        }
        return "Результат умножения " + numberOne + " и " + numberTwo + " равен " + result;
    }

    public String divisionCalculator(Integer numberOne, Integer numberTwo) {
        int result = numberOne / numberTwo;

        if (numberTwo == 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                return "Ошибка! Деление на ноль запрещено!";
            }
        } else if (numberOne == null || numberTwo == null) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                return "Ошибка! Один из параметров пустой!";
            }
        }
        return "Результат деления " + numberOne + " и " + numberTwo + " равен " + result;
    }
}
