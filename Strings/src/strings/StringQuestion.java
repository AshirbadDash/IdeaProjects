package strings;

public class StringQuestion {
    public static void main(String[] args) {
        String str = "Hello Java";
        char[] a = str.toCharArray();
        int left = 0;
        int right = a.length - 1;
        System.out.println(new String(a));

        while (left < right) {
            if (a[left] != ' ' && a[right] != ' ') {
                char temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            } else if (a[left] == ' ') {
                left++;
            } else if (a[right] == ' ') {
                right--;
            }
        }
        System.out.println(new String(a));
    }
}