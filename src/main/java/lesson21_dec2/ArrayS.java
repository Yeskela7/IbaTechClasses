package lesson21_dec2;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayS {
    public static String sorting(int[][] arr) {

        int[] list = Arrays.stream(arr).flatMapToInt(Arrays::stream).sorted().toArray();
        return Arrays.toString(list);

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 6, 3}, {}, {5, 4}, {7, 8, 2, 9}, {}};

        System.out.println(sorting(arr));
        maxim(arr);
        minim(arr);
        number(arr);
        avrg(arr);
        total(arr);

    }

    private static int total(int[][] arr) {
        int list = Arrays.stream(arr).flatMapToInt(Arrays::stream).sum();
        return list;
    }

    private static OptionalDouble avrg(int[][] arr) {
        OptionalDouble list = Arrays.stream(arr).flatMapToInt(Arrays::stream).average();

        return list;
    }

    private static int number(int[][] arr) {
        int list = (int) Arrays.stream(arr).flatMapToInt(Arrays::stream).count();
        return list;
    }

    private static OptionalInt minim(int[][] arr) {

        OptionalInt list = Arrays.stream(arr).flatMapToInt(Arrays::stream).min();
        return list;
    }

    private static int maxim(int[][] arr) {
        return 0;
    }
}
