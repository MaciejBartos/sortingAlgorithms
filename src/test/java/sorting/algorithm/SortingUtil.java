package sorting.algorithm;

import java.util.List;

public class SortingUtil {

    public static boolean checkIfSorted(List<Long> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) > numbers.get(i + 1))
                return false;
        }
        return true;
    }
}
