package lesson16_nov18.web;

import java.io.StringReader;

public class Calculator {

    public static String calculator(String x, String y, String operator) {
        int res;
        String result = "";
        try {
            Integer.parseInt(x);
            Integer.parseInt(y);
        }catch (NumberFormatException ex){
            return result = "Incorrect inout";
        }
        switch (operator) {
            case "plus":
                res = Integer.parseInt(x) + Integer.parseInt(y);
                result = Integer.toString(res);
                break;
            case "minus":
                res = Integer.parseInt(x) - Integer.parseInt(y);
                result = Integer.toString(res);
                break;
            case "mult":
                res = Integer.parseInt(x) * Integer.parseInt(y);
                result = Integer.toString(res);
                break;
            case "dev":
                if (Integer.parseInt(y) == 0){
                    result = "Dev by 0 is not possible";
                    break;
                }
                res = Integer.parseInt(x) / Integer.parseInt(y);
                result = Integer.toString(res);
                break;
            default:result = "wrong";
        }
        return result;
    }

}
