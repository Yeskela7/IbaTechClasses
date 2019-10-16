package lesson03;

import java.util.Random;

public class Generate {
    public static void main(String[] args) {
        new Generate(60);


    }

    private Generate(int length){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            Random rnd = new Random();
            char random_l = (char) (rnd.nextInt(90 - 65 + 1) + 65);
            s.append(random_l);
        }
        System.out.println(s);
    }


}
