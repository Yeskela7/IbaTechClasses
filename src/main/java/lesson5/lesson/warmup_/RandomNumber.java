package lesson5.lesson.warmup_;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rnd = new Random();
        int size = 20;
        int[] numberArray = new int[size];

        for(int i = 0; i < numberArray.length;  i++){

            int randomNumber = rnd.nextInt(10);
            numberArray[i] = randomNumber;
            if(numberArray[i] % 2 == 0){
                if(numberArray[i] % 3 == 0) {
                    System.out.printf("number = %d, fizzbuzz \n", numberArray[i]);
                }else {
                    System.out.printf("number = %d, fizz \n", numberArray[i]);
                }
            }else if(numberArray[i] % 3 == 0){
                System.out.printf("number = %d, buzz \n", numberArray[i]);
            }
        }





    }




}
