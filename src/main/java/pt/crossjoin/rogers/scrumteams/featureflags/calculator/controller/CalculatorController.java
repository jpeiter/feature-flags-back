package pt.crossjoin.rogers.scrumteams.featureflags.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.crossjoin.rogers.scrumteams.featureflags.calculator.enums.CalculatorType;
import pt.crossjoin.rogers.scrumteams.featureflags.environment.AppEnvironment;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @Autowired
    AppEnvironment appEnvironment;

    @GetMapping("/type")
    public CalculatorType getType() {
        if (appEnvironment.isBetaProgramActive()) {
            return CalculatorType.SCIENTIFIC;
        }
        return CalculatorType.STANDARD;
    }

}
