package sorting.algorithm;

import generator.NumbersGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class QuickSortTest {

    @Test
    public void shouldSortListOfElementsForLargeListOfNumbers() {
        // given
        NumbersGenerator numbersGenerator = new NumbersGenerator(200, -2000, 2000);
        SortingAlgorithm quickSort = new QuickSort();
        List<Long> numbersGenerated = numbersGenerator.generate();

        // when
        List<Long> sortedNumbers = quickSort.sort(numbersGenerated);

        // then
        assertTrue(SortingUtil.checkIfSorted(sortedNumbers));
    }

    @Test
    public void shouldSortListOfElementsForSmallListOfNumbers() {
        // given
        NumbersGenerator numbersGenerator = new NumbersGenerator(3, -2000, 2000);
        SortingAlgorithm quickSort = new QuickSort();
        List<Long> numbersGenerated = numbersGenerator.generate();

        // when
        List<Long> sortedNumbers = quickSort.sort(numbersGenerated);

        // then
        assertTrue(SortingUtil.checkIfSorted(sortedNumbers));
    }

    @Test
    public void shouldSortListOfElementsForListWithTwoElements() {
        // given
        NumbersGenerator numbersGenerator = new NumbersGenerator(2, -2000, 2000);
        SortingAlgorithm quickSort = new QuickSort();
        List<Long> numbersGenerated = numbersGenerator.generate();

        // when
        List<Long> sortedNumbers = quickSort.sort(numbersGenerated);

        // then
        assertTrue(SortingUtil.checkIfSorted(sortedNumbers));
    }

    @Test
    public void shouldSortListOfElementsForListWithOneElement() {
        // given
        NumbersGenerator numbersGenerator = new NumbersGenerator(1, -2000, 2000);
        SortingAlgorithm quickSort = new QuickSort();
        List<Long> numbersGenerated = numbersGenerator.generate();

        // when
        List<Long> sortedNumbers = quickSort.sort(numbersGenerated);

        // then
        assertTrue(SortingUtil.checkIfSorted(sortedNumbers));
    }

}
