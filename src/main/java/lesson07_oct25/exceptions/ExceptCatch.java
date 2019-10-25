package lesson07_oct25.exceptions;

public class ExceptCatch {
    public void transform(String origin){
        try {
            int integ = Integer.parseInt(origin);
            System.out.println(integ);
        }catch (NumberFormatException ex){
            System.out.println("Not a Number");
        }
    }
}
