package lesson04_oct18;

public class StringsAreTheRotated {




    public boolean check(String one, String two) {
    //    throw new IllegalArgumentException("must be implemented to pass the tests");
    return one.concat(one).contains(two);
    }
}
