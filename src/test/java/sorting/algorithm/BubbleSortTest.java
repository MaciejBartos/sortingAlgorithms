package sorting.algorithm;

import generator.NumbersGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void shouldSortListOfElements() {
        // given
        NumbersGenerator numbersGenerator = new NumbersGenerator(20, -50, 50);
        SortingAlgorithm bubbleSort = new BubbleSort();
        List<Long> numbersGenerated = numbersGenerator.generate();

        // when
        List<Long> sortedNumbers = bubbleSort.sort(numbersGenerated);

        // then
        assertTrue(SortingUtil.checkIfSorted(sortedNumbers));
    }
}
