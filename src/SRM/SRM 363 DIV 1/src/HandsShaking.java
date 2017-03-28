import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class HandsShaking {
	
	public long countPerfect(int n) {

		long[] result = new long[n+1];
		result[0] = 1;result[1] = 0;result[2] = 1;
		int m = 3;

		while(m <= n) {
			if(m % 2 == 1) { result[m++] = 0; continue; }
			long cnt = 0;
			for(int i=0;i<=m-2;i++) {
				cnt += result[i] * result[m-i-2];
			}
			result[m++] = cnt;
		}
		return result[n];
	}
}
