import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ColorfulRoad {
	
	public int getMin(String road) {

		if(road == null) return -1;

		int n = road.length();
		int[][] dp = new int[n][n];
        for(int i=0;i<n;i++)
		    Arrays.fill(dp[i],888);

		Map<Character,Character> charMap = new HashMap<Character,Character>();
		charMap.put('R','G');
		charMap.put('G','B');
		charMap.put('B','R');


        for(int i=0;i<n;i++) {
            char start = road.charAt(i);
			for(int j=i+1;j<n;j++) {
				if(road.charAt(j) == charMap.get(start)){
					//First row just i*i ref to 0
					if(i==0) {
                        dp[i][j] = j*j;
                    }
					else {
						int min = min(dp,i);
						dp[i][j] = min==Integer.MAX_VALUE?888:(j-i)*(j-i) + min(dp,i);
					}
				}
			}
		}

//		for(int i=0;i<n;i++) {
//			System.out.println();
//			for(int j=0;j<n;j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//		}

		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
			min = Math.min(min,dp[i][n-1]);
		if(min == 888) return -1;
		return min;
	}

	private int min(int[][] dp, int col) {
		int min = Integer.MAX_VALUE;
		for(int j=0;j<col;j++) {
			if(dp[j][col] == 888) continue;
			min = Math.min(min,dp[j][col]);
		}
		return min;
	}
//
//	public static void main(String[] args) {
//		String road = "RBRRBGGGBBBBR";
//		getMin(road);
//	}
}
