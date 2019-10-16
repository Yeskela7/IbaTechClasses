package lesson02;

public class ArrayExtra {

    // taking array as a parameter
    public static void print(int[] a) {
        System.out.print("<");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d, ", a[i]);
        }
        System.out.println(">");
    }

    // returning an array as a result
    public static int[] data() {
        return new int[]{7, 8, 9};
    }

    public static void main(String[] args) {
        String str = "You are the best Java developer ever";
        String substring = str.substring(1, 5);
        System.out.println(substring);
        // passing named array
        // passing unnamed (anonymous) array
        print(new int[]{4,5,6});

        int d[] = data();

        print(d);
    }
}
