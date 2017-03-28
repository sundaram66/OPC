package LC;

/**
 * Created by seetharams on 27/3/17.
 */
public class MaxPdtArray {


    public static void main(String[] args) {
        int[] a = {3,-2,-4};
        System.out.println(getMaxProduct(a));
    }

    private static int getMaxProduct(int[] a) {

        int n = a.length;
        if(n==0) return 0;
        int max = Integer.MIN_VALUE;
        int[] dp = new int[n];
        dp[0] = a[0];

        for(int i=1;i<n;i++) {
            dp[i] = Math.max(a[i],dp[i-1] * a[i]);
        }

        for(int val : dp) {
            max = Math.max(val,max);
        }

        return max;
    }


}
