package sorting.algorithm;

import java.util.Collections;
import java.util.List;

public class BubbleSort implements SortingAlgorithm {

    private long complexityCounter = 0;

    @Override
    public List<Long> sort(List<Long> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                complexityCounter++;
                if (numbers.get(i) > numbers.get(j))
                    swap(numbers, i, j);
            }
        }

        return numbers;
    }

    private void swap(List<Long> numbers, int positionX, int positionY) {
        Collections.swap(numbers, positionX, positionY);
    }

    @Override
    public long getComplexityCounter() {
        return complexityCounter;
    }
}
