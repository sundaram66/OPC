package HackerR;

/**
 * Created by seetharams on 2/12/16.
 */
import java.io.*;
import java.util.*;

public class MaxSumSubArray {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        int n = 0;
        while(t-- > 0) {
            n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            String[] str = br.readLine().trim().split(" ");
            for(int i=0;i<n;i++)
                a[i] = Integer.parseInt(str[i]);
            List<Integer> result = findMaxSum(a,n);
            System.out.print(result.get(0) + " " + result.get(1));
            System.out.println();
        }
    }


    public static List<Integer> findMaxSum(int[]a ,int n) {
        List<Integer> list = new ArrayList<>();

        int max_so_far = a[0];
        int currMax = a[0];


        for(int i=1;i<n;i++) {
            currMax = Math.max(a[i],currMax + a[i]);
            max_so_far = Math.max(max_so_far,currMax);
        }

        list.add(max_so_far);

        int currSum = 0;
        int min = Integer.MAX_VALUE;
        boolean positive = false;
        for(int i=0;i<n;i++) {
            min = Math.min(a[i],min);
            if(a[i] > 0) {
                positive = true;
                currSum += a[i];
            }
        }
        if(positive) list.add(currSum);
        else list.add(min);
        return list;
    }

}
