//import java.util.*;
//
//
//public class Arr_1 {
//    public static void main(String[] args) {
//        // Declare an integer variable `a` and assign it the value 10.
//        int a = 10;
//
//        // Declare an integer array `a1` and initialize it to null.
//        int[] a1 = null;
//
//        // Create a new Scanner object to read input from the console.
//        Scanner sc = new Scanner(System.in);
//
//        // Declare two integer variables `roll1` and `roll2` and assign them the values 12 and 13, respectively.
//        int roll1 = 12;
//        int roll2 = 13;
//
//        // Declare an integer array `rollnos` and initialize it with the values 1, 2, 3, 4, and 5.
//        int[] rollnos = new int[]{1, 2, 3, 4, 5};
//
//        // Declare an integer array `arr` and initialize it with a length of 4.
//        int[] arr = new int[4];
//
//        // Prompt the user to enter 4 integers and store them in the `arr` array.
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // Print the first element of the `arr` array.
//        System.out.println(arr[0]);
//
//        // Declare an integer array `arr1` and initialize it with the values 1, 3, 4, and 6.
//        int[] arr1 = {1, 3, 4, 6};
//
//        // Print the second element of the `arr1` array.
//        System.out.println(arr1[1]);
//
//        // Declare a String array `str` and initialize it with a length of 5.
//        String[] str = new String[5];
//
//        // Declare an integer array `arr2` and initialize it with a length of 5.
//        int[] arr2 = new int[5];
//
//        // Assign the values 12, 14, and 16 to the first three elements of the `arr2` array.
//        arr2[0] = 12;
//        arr2[1] = 14;
//        arr2[2] = 16;
//
//        // Print each element of the `arr2` array.
//        for (int ele : arr2) {
//            System.out.println(ele + " ");
//        }
//
//        // Print the `arr2` array as a string.
//        System.out.println(Arrays.toString(arr2));
//
//        // Try to assign the character 'a' to the second element of the `arr2` array. This will cause a runtime error because the `arr2` array can only store integer values.
//        arr2[1] = 'a';
//
//        // Declare a String array `s12` and initialize it with a length of 4.
//        String[] s12 = new String[4];
//
//        // Prompt the user to enter 4 strings and store them in the `s12` array.
////        for (int i = 0; i < s12.length; i++) {
////            s12[i] = sc.next();
////        }
//
//        // Print the `s12` array as a string.
//        System.out.println(Arrays.toString(s12));
//    }
//}