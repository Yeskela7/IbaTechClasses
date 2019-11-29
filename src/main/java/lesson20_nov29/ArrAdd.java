package lesson20_nov29;

import java.util.Arrays;

public class ArrAdd {

    public static int[] add(int len) {
        int i = 0;
        int n = len / 2 + 1;
        int[] arr = new int[len];
        while (i < (len / 2)) {
            arr[i] = arr[len - i - 1] = len % n++;
            ++i;
        }

        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(add(10)));
        System.out.println(Arrays.toString(add(9)));
    }
}
