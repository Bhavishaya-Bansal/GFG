import java.util.*;

public class CopyAnArray {
    public static void main(String[] args) {
        int a[]= {2, 8, 3};
        int b[]= new int[3];

        // iteration(a, b);

        // b = cloned(a);

        b= copy(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    // Method 1 to copy..
    public static void iteration(int[] a, int[] b){
        for(int i=0; i< a.length; i++){
            b[i]= a[i];
        }
    }

    // Method 2 to copy..
    public static int[] cloned(int[] a){
        int[] c= a.clone();
        return c;
    }

    // Method 3 to copy..
    public static int[] copy(int[] a){
        int[] c= Arrays.copyOf(a, 3);
        return c;
    }

    // Method 2 and 3 only works while we are declaring any new array, we cannot use 'clone()' method or 'Arrays.copyOf()' for an array that has already been declared/ initialized..
}
