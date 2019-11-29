package lesson20_nov29;

import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Comb {

    public static ArrayList<String> comb(ArrayList<String> arrayList){
        return (ArrayList<String>) arrayList.stream()
                .flatMap(a -> arrayList.stream().filter(b -> !b.equals(a))
                .map(b -> a +b)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        System.out.println(comb(strings));
    }

}
