package lesson11_nov06;

public class ShoesGroup {
    public static void main(String[] args) {
        String string = "RL RRLL RL RRLL";
        System.out.println(ShoesLine(string));
        String string1 = "RLLLRRRLLR";
        System.out.println(ShoesLine(string1));
        String string2 = "LLRLRLRLRLRLRR";
        System.out.println(ShoesLine(string2));


    }

    public static int ShoesLine(String line) {

        String[] strings= line.split("");
        int counter = 0;
        int pair = 0;

        for (String string : strings) {
            pair = pair + stringLine(string);
            if (pair == 0 && stringLine(string) != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int stringLine(String s){
        if(s.equals("L")){
            return 1;
        }
        if(s.equals("R")){
            return -1;
        }
        return 0;
    }



}
