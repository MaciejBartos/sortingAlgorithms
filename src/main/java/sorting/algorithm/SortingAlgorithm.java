package sorting.algorithm;

import java.util.List;

public interface SortingAlgorithm {

    long getComplexityCounter();
    List<Long> sort(List<Long> numbers);
}
