import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class NumberofFiboCalls {

	class count {
		int zero;
		int one;
	}
	
	public int[] fiboCallsMade(int n) {

		int[] result = new int[2];

		if(n==0) {
			result[0] = 1;
			result[1] = 0;
			return result;
		}

		if(n==1) {
			result[0] = 0;
			result[1] = 1;
			return result;
		}



		count[] dp = new count[n+1];
		for(int i=0;i<=n;i++)
			dp[i] = new count();
		dp[0].zero = 1;
		dp[0].one = 0;

		dp[1].zero = 0;
		dp[1].one = 1;

		for(int i=2;i<=n;i++) {
			dp[i].zero = dp[i-1].zero + dp[i-2].zero;
			dp[i].one = dp[i-1].one + dp[i-2].one;
		}

		result[0] = dp[n].zero;
		result[1] = dp[n].one;

		return result;
	}
}
