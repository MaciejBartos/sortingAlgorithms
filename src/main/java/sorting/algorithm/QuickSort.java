package sorting.algorithm;

import java.util.Collections;
import java.util.List;

public class QuickSort implements SortingAlgorithm {

    private long complexityCounter = 0;

    @Override
    public List<Long> sort(List<Long> numbers) {
        int lastIndex = numbers.size() - 1;
        sort(numbers, 0, lastIndex - 1, lastIndex);

        return numbers;
    }

    private void sort(List<Long> numbers, int startIndex, int endIndex, int pivotPosition) {
        if (checkStopCondition(startIndex, endIndex)) {
            return;
        }
        long pivot = numbers.get(pivotPosition);
        int savedStartIndex = startIndex;
        int skipIndex = 1;
        while (startIndex < endIndex) {
            while (numbers.get(startIndex) <= pivot && startIndex < endIndex)
                startIndex++;
            while (numbers.get(endIndex) >= pivot && startIndex < endIndex)
                endIndex--;
            if (startIndex < endIndex)
                swap(numbers, startIndex, endIndex);
        }
        if (numbers.get(startIndex) > pivot) {
            swap(numbers, startIndex, pivotPosition);
        } else {
            skipIndex = 0;
        }
        sort(numbers, savedStartIndex, startIndex - skipIndex - 1, startIndex - skipIndex);
        sort(numbers, startIndex + 1, pivotPosition - 1, pivotPosition);
    }

    private void swap(List<Long> numbers, int x, int y) {
        Collections.swap(numbers, x, y);
    }

    private boolean checkStopCondition(int startIndex, int endIndex) {
        return startIndex > endIndex;
    }

    @Override
    public long getComplexityCounter() {
        return complexityCounter;
    }
}
