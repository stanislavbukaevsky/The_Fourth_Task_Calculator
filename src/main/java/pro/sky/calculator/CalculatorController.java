package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator/")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }

    @GetMapping(path = "/plus")
    public String additionCalculator(@RequestParam(value = "num1", required = false) Integer numberOne, @RequestParam(value = "num2", required = false) Integer numberTwo) {
        return calculatorService.additionCalculator(numberOne, numberTwo);
    }

    @GetMapping(path = "/minus")
    public String subtractionCalculator(@RequestParam(value = "num1", required = false) Integer numberOne, @RequestParam(value = "num2", required = false) Integer numberTwo) {
        return calculatorService.subtractionCalculator(numberOne, numberTwo);
    }

    @GetMapping(path = "/multiply")
    public String multiplicationCalculator(@RequestParam(value = "num1", required = false) Integer numberOne, @RequestParam(value = "num2", required = false) Integer numberTwo) {
        return calculatorService.multiplicationCalculator(numberOne, numberTwo);
    }

    @GetMapping(path = "/divide")
    public String divisionCalculator(@RequestParam(value = "num1", required = false) Integer numberOne, @RequestParam(value = "num2", required = false) Integer numberTwo) {
        return calculatorService.divisionCalculator(numberOne, numberTwo);
    }
}
