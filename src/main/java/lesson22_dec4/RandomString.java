package lesson22_dec4;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomString {

    public static String filterStr(String origin)
    {
        return origin.chars()
                .distinct()
                .mapToObj(i->(char)i)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }


    public static void main(String[] args) {
        System.out.println(filterStr("aaajnjha"));
    }
}
