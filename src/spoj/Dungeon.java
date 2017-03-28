package spoj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by seetharams on 15/3/17.
 */
public class Dungeon {

    public static int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;

        if(m==0 || n == 0) return 0;

        int[][] dp = new int[m+1][n+1];

        for (int[] row: dp)
            Arrays.fill(row,Integer.MAX_VALUE);


        dp[m][n-1] = 1;
        dp[m-1][n] = 1;


        for(int i=m-1;i>=0;i--) {
            for(int j=n-1;j>=0;j--) {

                dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1]);
                if(dungeon[i][j] < dp[i][j]) dp[i][j] -= dungeon[i][j];
                else dp[i][j] = 1;

            }
        }

        return dp[0][0];


    }

    public static void main(String[] args) {

        int[][] a = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        //int[][] a = {{-3,5}};
        //int[][] a = {{1,-2,3},{2,-2,-2}};
        //int[][] a = {{100}};
        //int[][] a = {{0,5},{-2,-3}};
        System.out.println(calculateMinimumHP(a));

    }
}
