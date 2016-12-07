package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by seetharams on 2/12/16.
 */
public class MinMax {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        long[] a = new long[5];
        for(int i=0;i<5;i++) {
            a[i] = Long.parseLong(in[i]);
        }

        long[] left = new long[5];
        long[] right = new long[5];

        left[0] = a[0];
        for(int i=1;i<5;i++) {
            left[i] = a[i] + left[i-1];
        }

        right[4] = a[4];
        for(int i=3;i>=0;i--) {
            right[i] = a[i] + right[i+1];
        }

        long max = Long.MIN_VALUE,min = Long.MAX_VALUE;
        for(int k=0;k<5;k++) {
            if(k==0) {
                min = Math.min(min,right[k+1]);
                max = Math.max(max,right[k+1]);
            }
            else if(k==4) {
                min = Math.min(min,left[k-1]);
                max = Math.max(max,left[k-1]);
            }
            else {
                min = Math.min(min, left[k - 1] + right[k + 1]);
                max = Math.max(max, left[k - 1] + right[k + 1]);
            }

        }

        System.out.print(min + " " + max);


    }
}
