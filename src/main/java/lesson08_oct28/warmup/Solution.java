package lesson08_oct28.warmup;

import java.util.Scanner;

public class Solution {

    public int inplementation(String input){
        int sum = 0;
        String[] inputS = input.split(" ");

        for (String c: inputS)
        {
            try{
            int sums = Integer.parseInt(c);
                sum += sums;
            } catch (NumberFormatException ex){
                sum =sum;
            }
        }

        return sum;
    }


}
