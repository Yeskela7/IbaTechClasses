package lesson12_nov08;

public class Warmup {
    public static String stringFilter(String origin) {
        String[] strings = origin.split("");
        String filtered = "";
        for (int i = 0; i < strings.length; i++) {
            String l = strings[i];
            if (!l.equals("a") && !l.equals("o")  && !l.equals("u") && !l.equals("i") && !l.equals("e") ) {
                filtered = filtered.concat(strings[i]);
            }
        }
        return filtered;
    }
}
