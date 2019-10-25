package lesson07_oct25.warmup;

import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int s = 0;

        Set<Integer> integerSet = new HashSet<>();

        Random random = new Random();

        while(integerSet.size() < 20){
            int i = random.nextInt(20) - 10;
            integerSet.add(i);
        }
        System.out.println(integerSet);


        ArrayList<String> stringArrayList = new ArrayList<>();

        while (s < 21){
            int length = random.nextInt(20)+1;
            int in = 0;
            String string = new String();
            while (in < length){
                char c = (char) (random.nextInt(90-65+1) + 65);
                string += c;
                in++;
            }
            stringArrayList.add(string);
            s++;
        }

        Map<Integer, String> stringMap = new HashMap<>();


        int key = 1;
        while (key < 21){
            stringMap.put(key,stringArrayList.get(key));
            key++;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String shortest = new String();
        String longest = new String();

        for (Map.Entry<Integer, String> item: stringMap.entrySet()) {
            if(item.getValue().length() > max){
                max = item.getValue().length();
                longest = item.getValue();
            }
            if(item.getValue().length() < min){
                min = item.getValue().length();
                shortest = item.getValue();
            }
        }

        System.out.println(longest);
        System.out.println(shortest);
    }




}
