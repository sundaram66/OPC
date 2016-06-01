import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ShorterSuperSum {
	
	public int calculate(int k, int n) {

		int[] arr = new int[n];

		//fill first row alone
		for(int i=0;i<n;i++) {
			arr[i] = i+1;
		}

		while(k > 0) {
			for(int i=1;i<n;i++) {
				arr[i] = arr[i-1]  + arr[i];
			}
			k--;
		}


		return arr[n-1];
	}
}
