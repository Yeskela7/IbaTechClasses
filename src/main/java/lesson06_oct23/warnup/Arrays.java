package lesson06_oct23.warnup;

import java.util.ArrayList;
import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList();

        ArrayList evenNumber = new ArrayList();
        ArrayList oddNumber = new ArrayList();

        for (int i = 0; i < 100; i++) {
            int rnd = random.nextInt(100);
            list.add(rnd);
        }
        list.forEach(item -> {
            if (item % 2 == 0) evenNumber.add(item);
        });
        list.forEach(item -> {
            if (item % 2 == 1) oddNumber.add(item);
        });


        System.out.println(list);
        System.out.println(evenNumber);
        System.out.println(oddNumber);
    }


}
