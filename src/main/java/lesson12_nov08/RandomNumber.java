package lesson12_nov08;

import java.util.ArrayList;
import java.util.Collections;

public class RandomNumber {
    private static ArrayList<Integer> integerArrayList(int length) {
        ArrayList<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            integerList.add((int) (Math.random() * 50));
        }
        return integerList;
    }

    public static boolean binarySort(ArrayList<Integer> arrayList, int n) {
        int hi = arrayList.size() - 1;
        int lo = 0;
        while (lo < hi) {
            int mi = mid(lo, hi);
            if (arrayList.get(mi) == n) return true;
            if (arrayList.get(mi) > n) {
                hi = mi - 1;
            } else {
                lo = mi + 1;
            }
        }
        return false;
    }

    public static boolean binarySortRec(ArrayList<Integer> arrayList, int hi, int lo, int n) {
        int mi = mid(lo, hi);
        if (arrayList.get(mi) == n) return true;
        if (arrayList.get(mi) > n) {
            hi = mi - 1;
        } else {
            lo = mi + 1;
        }
        return false;

    }

    private static int mid(int lo, int hi) {
        return (hi + lo) / 2;
    }

    public static void main(String[] args) {
        ArrayList list = integerArrayList(50);
        Collections.sort(list);
        System.out.println(list);
        boolean x = binarySort(list, 5);
        System.out.println(x);
    }

}
