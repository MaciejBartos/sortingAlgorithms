import generator.NumbersGenerator;
import sorting.algorithm.BubbleSort;
import sorting.algorithm.QuickSort;
import sorting.algorithm.SortingAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        SortingAlgorithm quickSort = new QuickSort();
        SortingAlgorithm bubbleSort = new BubbleSort();
        NumbersGenerator numbersGenerator = new NumbersGenerator(2000, -20000, 20000);
        List<Long> generatedNumbers = numbersGenerator.generate();
        List<Long> generatedNumbers2 = new ArrayList<>(generatedNumbers);

        System.out.println(quickSort.sort(generatedNumbers));
        System.out.println(bubbleSort.sort(generatedNumbers2));
        System.out.println("quick sort complexity: " + quickSort.getComplexityCounter());
        System.out.println("bubble sort complexity: " + bubbleSort.getComplexityCounter());
    }
}
