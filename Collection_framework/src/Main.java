//list in collection
import  java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>(); //an empty arraylist of string type is created
        name.add("Rahul"); //internal array is created of size 10
        name.add("Raj");
        name.add("Rohan");
        name.add("Ravi");
        name.add("Rajesh");

        // new array is created of size n+n/2 +1 and all the elements of previous array are copied to new array
        // new array is assigned to old array name and old array is garbage collected

        System.out.println(name);
        name.get(2); //O(1)



    }
}
