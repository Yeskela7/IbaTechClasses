package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        int[] array = new int[10];
        System.out.println(array[1]);
        for (int i = 1; i < array.length; i++) {
            array[i] = i-10;

            System.out.println(array[i]);

        }
        System.out.println(Arrays.toString((array)));

        }








    }





