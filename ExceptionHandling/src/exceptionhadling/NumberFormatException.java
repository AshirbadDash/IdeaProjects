package exceptionhadling;
import java.lang.String;

public class NumberFormatException {
    public static void main(String[] args) {
        String s ="123a"; //number format exeception
        int parseInt =Integer.parseInt(s);
        System.out.println(parseInt);



    }
}
