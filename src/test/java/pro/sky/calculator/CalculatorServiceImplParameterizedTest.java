package pro.sky.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.calculator.CalculatorServiceConstantsTest.*;

public class CalculatorServiceImplParameterizedTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForAdditionTests() {
        return Stream.of(
                Arguments.of(TWO, SIX, "Результат сложения 2 и 6 равен 8"),
                Arguments.of(ONE, FIVE, "Результат сложения 1 и 5 равен 6")
        );
    }

    public static Stream<Arguments> provideParamsForSubtractionTests() {
        return Stream.of(
                Arguments.of(SEVEN, THREE, "Результат вычитания 7 и 3 равен 4"),
                Arguments.of(NINE, ONE, "Результат вычитания 9 и 1 равен 8")
        );
    }

    public static Stream<Arguments> provideParamsForMultiplicationTests() {
        return Stream.of(
                Arguments.of(FIVE, FOUR, "Результат умножения 5 и 4 равен 20"),
                Arguments.of(SEVEN, EIGHT, "Результат умножения 7 и 8 равен 56")
        );
    }

    public static Stream<Arguments> provideParamsForDivisionTests() {
        return Stream.of(
                Arguments.of(NINE, THREE, "Результат деления 9 и 3 равен 3"),
                Arguments.of(SIX, ONE, "Результат деления 6 и 1 равен 6")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForAdditionTests")
    public void getAdditionCalculator(Integer num1, Integer num2, String expectedString) {
        String result = calculatorService.additionCalculator(num1, num2);
        assertEquals(expectedString, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubtractionTests")
    public void getSubtractionCalculator(Integer num1, Integer num2, String expectedString) {
        String result = calculatorService.subtractionCalculator(num1, num2);
        assertEquals(expectedString, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplicationTests")
    public void getMultiplicationCalculator(Integer num1, Integer num2, String expectedString) {
        String result = calculatorService.multiplicationCalculator(num1, num2);
        assertEquals(expectedString, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivisionTests")
    public void getDivisionCalculator(Integer num1, Integer num2, String expectedString) {
        String result = calculatorService.divisionCalculator(num1, num2);
        assertEquals(expectedString, result);
    }
}
