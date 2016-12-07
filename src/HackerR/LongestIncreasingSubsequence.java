package Hackerrank;

/**
 * Created by seetharams on 2/12/16.
 */
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        int[] a = {12,3,2,1,2,4,5,15,12};
        int n = a.length;
        int len = findLISLength(a,n);

    }

    public static int findLISLength(int[] a,int n) {
        int len = 0;
        int[] lis = new int[n];
        for(int i=0;i<len;i++)
            lis[i] = 1;

        for(int i=1;i<n;i++) {
            for(int j=0;j<i;i++) {
                if(a[j] < a[i] && lis[i] < lis[j]+1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        int maxLen = lis[0];
        for (int s : lis) {
            maxLen = Math.max(maxLen,s);

        }
        return maxLen;
    }


}
