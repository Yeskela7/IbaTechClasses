package lesson07_oct25.exceptions;

import java.io.*;
import java.util.Scanner;

public class ExceptApp {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String  str = in.nextLine();
        ExceptCatch exp = new ExceptCatch();
        exp.transform(str);

        BufferedReader br = new BufferedReader(new FileReader(new File("1.txt")));
        br.readLine();

    }
}
