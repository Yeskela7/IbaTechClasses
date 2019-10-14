package test;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.printf("Hello %s.\nLet's play the game ", name);
        double num = (Math.random() * (100 - 1) - 1);
        int numb = (int) num;
        System.out.println(numb);
        while (true) {
            int your_num = s.nextInt();

            if (your_num < numb) {
                System.out.println("less");
            } else if( your_num > numb){
                System.out.println("more");
            } else {
                System.out.println("Cong");
                break;
            }

            System.out.println('s');

        }
    }
}

