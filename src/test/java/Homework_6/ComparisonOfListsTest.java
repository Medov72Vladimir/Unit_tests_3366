package Homework_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static Homework_6.ComparisonOfLists.calculateAverage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ComparisonOfListsTest {
    @Test
    @DisplayName("Оба списка содержат одинаковые значения")
    public void testEqualLists() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        double avg1 = calculateAverage(list1);
        double avg2 = calculateAverage(list2);
        assertEquals("We expect the average values to be equal", avg1, avg2, 0.001);
    }
    @Test
    @DisplayName("Первый список имеет большее среднее значение")
    public void testFirstListGreater() {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        double avg1 = calculateAverage(list1);
        double avg2 = calculateAverage(list2);
        assertTrue("We expect that the average value of the first list will be greater than that of the second", avg1 > avg2);
    }
    @Test
    @DisplayName("Второй список имеет большее среднее значение")
    public void testSecondListGreater() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);
        double avg1 = calculateAverage(list1);
        double avg2 = calculateAverage(list2);
        assertTrue("We expect that the average value of the second list will be greater than the first", avg2 > avg1);
    }
    @Test
    @DisplayName("Оба списка пусты")
    public void testDifferentAverage() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        double avg1 = calculateAverage(list1);
        double avg2 = calculateAverage(list2);
        assertEquals("We expect the averages to be equal", avg1, avg2, 0.001);
    }
    @Test
    @DisplayName("Генерация списка случайных чисел")
    public void testGenerateRandomList() {
        int size = 10;
        List<Integer> list = ComparisonOfLists.generateRandomList(size);
        assertEquals(list.size(), size);
        for (int i = 0; i < size; i++) {
            assertTrue(list.get(i) >= 0 && list.get(i) < 100);
        }
    }
    @Test
    @DisplayName("Вычисление среднего арифметического значения элементов списка")
    public void testCalculateAverage() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        double expected = 2.0;
        double actual = ComparisonOfLists.calculateAverage(list);

        assertEquals(expected, actual, 0.001);

        list.clear();

        expected = Double.NaN;
        actual = ComparisonOfLists.calculateAverage(list);

        assertEquals(expected, actual, 0.001);
    }
}
