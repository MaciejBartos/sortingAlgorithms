package generator;

import java.util.ArrayList;
import java.util.List;

public class NumbersGenerator {

    private final int numberOfGeneratedNumbers;
    private final int minValue;
    private final int maxValue;

    public NumbersGenerator(int numberOfGeneratedNumbers, int minValue, int maxValue) {
        this.numberOfGeneratedNumbers = numberOfGeneratedNumbers;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public List<Long> generate() {
        List<Long> generatedNumbers = new ArrayList<>();

        for (int i = 0; i < numberOfGeneratedNumbers; i++) {
            generatedNumbers.add(getRandomLongValueFromRange(minValue, maxValue));
        }

        return generatedNumbers;

    }

    private Long getRandomLongValueFromRange(final int min, final int max) {
        double randomValue = Math.random();
        return Math.round((randomValue * ((max - min) + 1)) + min);
    }
}
