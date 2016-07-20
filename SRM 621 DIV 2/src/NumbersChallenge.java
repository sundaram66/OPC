import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class NumbersChallenge {

	public static void main(String[] args) {
		System.out.println(countNumbersWithUniqueDigits(3));
	}
	
	public int MinNumber(int[] a) {

		int maxSum = 0;
		maxSum = Arrays.stream(a).sum();
		int[] result = new int[maxSum+1];

		int n = a.length;
		int maxInt = (int) Math.pow(2.0,n);

		for(int i=1;i<maxInt;i++) {
			int sum = getSum(i,a);
			result[sum] = 1;
		}

		for(int i=1;i<maxSum+1;i++) {
			if(result[i]==0) return i;
		}

		return maxSum+1;
	}

	private int getSum(int value, int[] a) {
		String s = Integer.toBinaryString(value);
		int sum = 0,n=s.length(),n1=a.length;
		int j=n1-n;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)-'0' == 1)
				sum += a[j];
			j++;
		}
		return sum;

	}



		public static int countNumbersWithUniqueDigits(int n) {

			int[] a = new int[n+1] ;

			if(n == 0) { return 1; }
			if(n == 1) { return 10; }
			if(n == 2) { return 91; }

			a[0] = 1;
			a[1]=9;
			a[2]=81;
			int rep=3,mul=8;
			while(rep <= n ) {
				int curr=a[rep-1];
				curr *= mul--;
				a[rep] = curr;
				rep++;
			}

			int result = 0;
			for(int i=0;i<=n;i++) {
				result += a[i];
			}
			return result;

		}
}
