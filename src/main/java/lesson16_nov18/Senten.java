package lesson16_nov18;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Senten {

    private static Map<String, List<String>>[] of;

    public static ArrayList<String> array() {


        List<String> subjects = list("Noel", "The cat", "The dog");
        List<String> verbs = list("wrote", "chased", "slept on");
        List<String> objects = list("the book", "the ball", "the bed");

        ArrayList<String> sen = new ArrayList<>();
        for (String sub : subjects) {
            for (String verb : verbs) {
                for (String object : objects) {
                    sen.add(sent(sub, verb, object));
                }
            }
        }

        return sen;
    }

    private static String sent(String s1, String s2, String s3){
        return s1 + " " + s2 + " " + s3 + "\n";
    }

    private static Map.Entry<String, List<String>> of(String s, ArrayList<String> list){
        return new AbstractMap.SimpleEntry<>(s, list);
    }


    @SafeVarargs
    private static Map<String, List<String>> map(Map.Entry<String, List<String>>... item) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (Map.Entry<String, List<String>> i : item){
            hashMap.put(i.getKey(), i.getValue());
        }
        return hashMap;
    }

    private static List<String> solution (Map<String, List<String>> assoc_subj_verb,
                                          Map<String, List<String>> assoc_verb_obj){

        return assoc_subj_verb.keySet().stream().flatMap(subj ->
                assoc_subj_verb.get(subj).stream().flatMap(verb ->
                        assoc_verb_obj.get(verb).stream().map(obj ->
                                sent(subj, verb, obj)
                        )))
                .collect(Collectors.toList());
    }

    private static ArrayList<String> list(String s1, String s2, String s3){
        ArrayList<String> strings =new ArrayList<>();
        strings.add(s1);
        strings.add(s2);
        strings.add(s3);
        return strings;
    }

    public static void main(String[] args) {

        Map<String, List<String>> assoc_subj_verb = map(
                of("Noel", list("wrote", "chased", "slept on")),
                of("The cat", list("meowed at", "chased", "slept on")),
                of("The dog", list("barked at", "chased", "slept on")));

        Map<String, List<String>> assoc_verb_obj = map(
                of("wrote", list("the book", "the letter", "the code")),
                of("chased", list("the ball", "the dog", "the cat")),
                of("slept on", list("the bed", "the mat", "the train")),
                of("meowed at", list("Noel", "the door", "the food cupboard")),
                of("barked at", list("the postman", "the car", "the cat")));
        System.out.println(solution(assoc_subj_verb,assoc_verb_obj));
    }


}
