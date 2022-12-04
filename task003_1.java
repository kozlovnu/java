package HomeWork;

// 1. Реализовать алгоритм сортировки слиянием.
// 2. Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class task003_1 {
    public static void main(String[] args) {
        System.out.println("Task001 - merge sort");

        int[] checkArray = randomArray();
        System.out.println("Original array -> ");
        System.out.println(Arrays.toString(checkArray));
        int[] sortArray = mergeSort(checkArray);
        System.out.println("Sorted array -> ");
        System.out.println(Arrays.toString(sortArray));
        System.out.println();

        System.out.println("Task002 - remove even numbers");
        System.out.println(sortList(createList()));
        System.out.println();

        System.out.println("Task003 - find min, max elements and average");
        findMinMaxAvg(createList());
    }

    public static int[] randomArray() {
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int n = random.nextInt(100) - 50;
            arr[i] = n;
        }
        return arr;
    }

    private static int[] mergeSort(int[] checkArray) {
        int[] buffer1 = Arrays.copyOf(checkArray, checkArray.length);
        int[] buffer2 = new int[checkArray.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, checkArray.length);
        return result;
    }

    private static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    private static List createList() {
        List numbersList = new ArrayList<Integer>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            numbersList.add(rd.nextInt(0, 100));
        }

        return numbersList;
    }

    private static List sortList(List list) {

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if ((Integer) list.get(i) % 2 == 0) {
                // System.out.println(list.get(i));
                list.remove(i);
            }
            else continue;
        }

        return list;
    }

    private static void findMinMaxAvg(List list) {
        int min = (Integer) list.get(0);
        int max = (Integer) list.get(0);
        int avg = 0;
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if ((Integer) list.get(i) < min) {
                min = (Integer) list.get(i);
            } else if ((Integer) list.get(i) > max) {
                max = (Integer) list.get(i);
            }
            avg = avg + (Integer) list.get(i);
        }
        avg = avg / list.size();

        System.out.printf("Min element is %d\n", min);
        System.out.printf("Max element is %d\n", max);
        System.out.printf("Average is %d\n", avg);

    }

}
