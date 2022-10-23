package pro.sky.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.calculator.CalculatorServiceConstantsTest.*;

public class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void getAdditionCalculator() {
        String resultOne = calculatorService.additionCalculator(TWO, THREE);
        assertEquals("Результат сложения " + TWO + " и " + THREE + " равен " + 5, "Результат сложения 2 и 3 равен 5");
        String resultTwo = calculatorService.additionCalculator(ONE, FIVE);
        assertEquals("Результат сложения " + ONE + " и " + FIVE + " равен " + 6, "Результат сложения 1 и 5 равен 6");
    }

    @Test
    public void getSubtractionCalculator() {
        String resultOne = calculatorService.subtractionCalculator(FIVE, FOUR);
        assertEquals("Результат вычитания " + FIVE + " и " + FOUR + " равен " + 1, "Результат вычитания 5 и 4 равен 1");
        String resultTwo = calculatorService.subtractionCalculator(NINE, SIX);
        assertEquals("Результат вычитания " + NINE + " и " + SIX + " равен " + 3, "Результат вычитания 9 и 6 равен 3");
    }

    @Test
    public void getMultiplicationCalculator() {
        String resultOne = calculatorService.subtractionCalculator(TWO, FOUR);
        assertEquals("Результат умножения " + TWO + " и " + FOUR + " равен " + 8, "Результат умножения 2 и 4 равен 8");
        String resultTwo = calculatorService.subtractionCalculator(SEVEN, EIGHT);
        assertEquals("Результат умножения " + SEVEN + " и " + EIGHT + " равен " + 56, "Результат умножения 7 и 8 равен 56");
    }

    @Test
    public void getDivisionCalculator() {
        String resultOne = calculatorService.subtractionCalculator(SIX, THREE);
        assertEquals("Результат деления " + SIX + " и " + THREE + " равен " + 2, "Результат деления 6 и 3 равен 2");
        String resultTwo = calculatorService.subtractionCalculator(EIGHT, TWO);
        assertEquals("Результат деления " + EIGHT + " и " + TWO + " равен " + 4, "Результат деления 8 и 2 равен 4");
    }

    @Test
    public void getCheckingForThrowingAnException() {
        assertThrows(RuntimeException.class, () -> calculatorService.divisionCalculator(TWO, ZERO));
    }
}
