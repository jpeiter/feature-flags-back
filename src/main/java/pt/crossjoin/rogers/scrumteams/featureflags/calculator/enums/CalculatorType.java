package pt.crossjoin.rogers.scrumteams.featureflags.calculator.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CalculatorType {

    STANDARD("Standard"),
    SCIENTIFIC("Scientific");

    private final String label;

}
