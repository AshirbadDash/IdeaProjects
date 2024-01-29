package exceptionhadling;

public class ClassNotFoundException {
    public static void main(String[] args) {
        try{
            Class.forName("Demo");

        }
        catch(ClassNotFoundException e){
            e.printStackTrace();

        }
    }
}
