package exceptionhadling;

public class ClassCastException {
    public static void main(String[] args) {
        Object o = "Hello";
        Integer  i=(Integer)0;
        System.out.println(i);
    }
}
