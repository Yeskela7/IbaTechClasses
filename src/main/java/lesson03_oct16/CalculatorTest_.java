package lesson03_oct16;

public class CalculatorTest_ {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        if(c.add(1,1) == 2){
            System.out.println("Ok");
        }else {
            System.out.println("mistake");
        }
    }

    @org.junit.jupiter.api.Test
    void add() {
    }

    @org.junit.jupiter.api.Test
    void sub() {
    }
}
