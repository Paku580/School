import com.google.common.collect.Ordering;
import com.paku.Utils;
import com.paku.sortingalgorithms.BubbleSort;
import com.paku.sortingalgorithms.InsertionSort;
import com.paku.sortingalgorithms.SelectionSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortingAlgorithmTests {

  @Test
  public void bubbleSort() {
    List<Integer> numbers = Utils.generateRandomNumbers(1000);
    new BubbleSort(numbers).sort();
    assertTrue(Ordering.natural().isOrdered(numbers), "List must be sorted");
  }

  @Test
  public void insertionSort() {
    List<Integer> numbers = Utils.generateRandomNumbers(1000);
    new InsertionSort(numbers).sort();
    assertTrue(Ordering.natural().isOrdered(numbers), "List must be sorted");
  }

  @Test
  public void selectionSort() {
    List<Integer> numbers = Utils.generateRandomNumbers(1000);
    new SelectionSort(numbers).sort();
    assertTrue(Ordering.natural().isOrdered(numbers), "List must be sorted");
  }
}
