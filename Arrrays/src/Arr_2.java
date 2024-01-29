import java.util.Arrays;

public class Arr_2 {
    //passing in function
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    //strings are immutable in java
    //arrays are mutable in java
    static void change(int[] arr) {
        arr[2] = 99;
    }


}
