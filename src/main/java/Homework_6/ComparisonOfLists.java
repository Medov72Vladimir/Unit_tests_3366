package Homework_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComparisonOfLists {
    public static void main (String[] args) {

        List<Integer> list1 = generateRandomList(10);
        List<Integer> list2 = generateRandomList(10);

        double avg1 = calculateAverage(list1);
        double avg2 = calculateAverage(list2);

        System.out.println("Среднее значение списка 1: " + avg1);
        System.out.println("Среднее значение списка 2: " + avg2);

        if (avg1 > avg2) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (avg1 < avg2) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения списков равны");
        }
    }
    static List<Integer> generateRandomList(int size) {
        Random sc = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt(100));
        }
        return list;
    }
    static double calculateAverage(List<Integer> list) {
        double sum = 0;
        for (int num: list) {
            sum += num;
        }
        return sum / list.size();
    }
}
