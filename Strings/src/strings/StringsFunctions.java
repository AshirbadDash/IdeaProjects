package strings;

import java.lang.*;

public class StringsFunctions {
    //contains() method
    // The contains() method searches the sequence of characters in the given string.
    // contains() is case sensitive. If you pass the uppercase character, it will return false.
    // It returns true if the sequence of characters is found in the given string, otherwise returns false.
    // Syntax:
    // public boolean contains(CharSequence s)
    // Parameters: s - the sequence to search for
    // Returns: true if this string contains s, false otherwise
    // Throws: NullPointerException - if s is null
    // Example:

    public static void containsMethod() {
        java.lang.String str = "Hello World";
        System.out.println(str.contains("Hello"));
        System.out.println(str.contains("World"));
        System.out.println(str.contains("Hello World"));
        System.out.println(str.contains("HelloWorld"));

        // Output:
        // true
        // true
        // true
        // false


    }

    //startsWith() method
    // The startsWith() method checks whether a string starts with the specified prefix beginning.
    // It returns true if the character sequence represented by the argument is a prefix of the character sequence
    // represented by this string; false otherwise.
    // Note: The result will be true if the argument is an empty string or
    // is equal to this String object as determined by the equals(Object) method.
    // Syntax:
    // public boolean startsWith(String prefix)
    // Parameters: prefix - the prefix
    // Returns: true if the character sequence represented by the argument is a prefix of the character sequence
    // represented by this string; false otherwise.
    // Note also that true will be returned if the argument is an empty string or
    // is equal to this String object as determined by the equals(Object) method.
    // Throws: NullPointerException - if prefix is null
    // Example:

    public static void startsWithMethod() {
        java.lang.String str = "Hello World";
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.startsWith("World"));
        System.out.println(str.startsWith("Hello World"));
        System.out.println(str.startsWith("HelloWorld"));

        // Output:
        // true
        // false
        // true
        // false

    }

    // endsWith() method
    // The endsWith() method checks whether a string ends with the specified suffix.
    // It returns true if the character sequence represented by the argument is a suffix of the character sequence
    // represented by this object; false otherwise.
    // Note: The result will be true if the argument is the empty string or is equal to this String object as determined by
    // the equals(Object) method.
    // Syntax:
    // public boolean endsWith(String suffix)
    // Parameters: suffix - the suffix
    // Returns: true if the character sequence represented by the argument is a suffix of the character sequence represented by
    // this object; false otherwise. Note that the result will be true if the argument is the empty string or is equal to this String
    // object as determined by the equals(Object) method.
    // Throws: NullPointerException - if suffix is null
    // Example:

    public static void endsWithMethod() {
        java.lang.String str = "Hello World";
        System.out.println(str.endsWith("Hello"));
        System.out.println(str.endsWith("World"));
        System.out.println(str.endsWith("Hello World"));
        System.out.println(str.endsWith("HelloWorld"));

        // Output:
        // false
        // true
        // true
        // false

    }


    public static void main(String[] args) {
        containsMethod();
        startsWithMethod();
        endsWithMethod();


    }
}
