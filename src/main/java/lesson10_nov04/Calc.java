package lesson10_nov04;
public class Calc {
    public static int calc(String str) {
        String[] arrayList = str.split("");
        int counter = 0;
        for (int i = 0; i < arrayList.length / 2; i++) {
            if(arrayList[i] != arrayList[arrayList.length-1-i]){
                counter += 1;
            }
        }
        return counter;
    }
}
