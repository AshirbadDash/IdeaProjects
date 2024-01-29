package strings;

import java.util.*;
import java.lang.*;

public class StringBuilder {

    public StringBuilder(String hello) {
    }

    public static void main(String[] args) {

//        StringBuilder sb = new StringBuilder(); //empty string builder object with default capacity 16
//        StringBuilder sb1 = new StringBuilder(100); //empty string builder object with capacity 100
        StringBuilder sb2; //string builder object with capacity 16 and value "Hello"
        sb2 = new StringBuilder("Hello");





        sb2.append("World"); //append "World" to sb2
        System.out.println(sb2); //HelloWorld
        sb2.append(10); //append 10 to sb2
        System.out.println(sb2); //HelloWorld10

//        sb2.charAt(0) = 'd';// replace character at index 0 with 'd' not possible in string but possible in string builder

//        hello --> mello





//        insert(int offset, String str) --> inserts string str at offset
        sb2.setCharAt(0, 'm');
        StringBuilder sb3 = new StringBuilder("hello");
        sb3.insert(0, 'm'); // index 0, character 'm'
        System.out.println(sb3); //mhello

        //deleteCharAt(int index) --> deletes character at index
         sb3.deleteCharAt(0);
        System.out.println(sb3); //hello

//        reverse() --> reverses the string
        sb3.reverse();
        System.out.println(sb3); //ollehA


        System.out.println(sb3); //hello

        //delete(int start, int end) --> deletes characters from start to end-1
        sb3.delete(0, 2);
        System.out.println(sb3); //ll

        //converting string to stringBuilder
        String sa ="assas";
        StringBuilder saa =new StringBuilder(sa);

        //converting stringbuilder to string






    }
}