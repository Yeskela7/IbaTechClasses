package lesson08_oct28.warmup;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        int x = solution.inplementation(input);


        System.out.println(x);
    }
}
