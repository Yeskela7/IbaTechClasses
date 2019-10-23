package lesson03_oct16;

import java.util.Random;

public class Generate {
    public static void main(String[] args) {

        generate(45);
    }


    static void generate(int length) {
        String s = new String();
        for (int i = 0; i < length; i++) {
            Random rnd = new Random();
            char random_l = (char) (rnd.nextInt(90 - 65 + 1) + 65);
            s = s + random_l;
        }
        System.out.println(s);


    }
}
