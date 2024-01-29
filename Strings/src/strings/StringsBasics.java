package strings;

import java.util.Scanner;
import java.lang.*;

public class StringsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        integer array is called as arrays
        // similarly character arrays are called as strings
        char[] ch = new char[2];
        //String as a class
        //java has created a String class instead to use char array as strings
        //because char arrays has limitations of creating multiple times and size is final.

        //String declaration
        java.lang.String s = "Hello World";
        System.out.println(s);

        //String input

        //sc.next() will read whole line as a word nothing will be read after a space

//        String str =sc.next();
//        System.out.println(str);
//        String line =sc.nextLine();

        java.lang.String a;
        a = "Hello ";

        //functions of String class

//        charAt() --> gives the index where the character is present in the string

//         length() -->gives the length of String

        System.out.println(a.charAt(5));
        System.out.println(a.length());

        //indexOf() -->gives the charater at the index present in the string

        java.lang.String name = "Ashirbad";
        System.out.println(name.indexOf('A')); ///ASk

        //compareTo() -->it compares 2 string str==gtr and if both are same it returns 0
        //if str>gtr lexographically(alphabetically) gives 1
        //if str<gtr returns -1

//        str -----  gtr---->  return
//        abc   ==     abc        0
//        bbc   >    abc         +ve
//        abd   >    abc         +ve
//        abc   <    zbc         -ve

        java.lang.String str = "Hello";
        java.lang.String gtr = "Dello";

        System.out.print(str.compareTo(gtr));





    }
}
