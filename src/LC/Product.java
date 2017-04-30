package LC;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by seetharams on 20/4/17.
 */
public class Product {

    public static void main(String[] args) {

        int[] a = {1, 0};
        int[] result = productExceptSelf(a);
        System.out.println(result[0] + ":" + result[1]);

    }

    public static int[] productExceptSelf(int[] a) {

        Set valueSet = new HashSet<>();
        int n = a.length;
        int[] output = new int[n];
        int temp = 1;
        output[0] = temp;
        for(int i=1;i<n;i++) {
            temp = temp * a[i-1];
            output[i] = temp;
        }


        temp = 1;
        for(int i=n-2;i>=0;i--) {
            temp = temp * a[i+1];
            output[i] *= temp;

        }

        return output;

    }
}

