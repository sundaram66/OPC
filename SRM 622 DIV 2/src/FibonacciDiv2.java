import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FibonacciDiv2 {
	
	public int find(int N) {

		int[] fib = new int[100000];

		fib[0] = 0;
		fib[1] = 1;

		for(int i=2;i<100000;i++) {

			if(N == fib[i-1]) return 0;

			fib[i] = fib[i-1] + fib[i-2];

			if(N == fib[i]) return 0;

			if(N > fib[i-2] && N < fib[i-1]) {
				return Math.min(N-fib[i-2],fib[i-1]-N);
			}

		}

		return 0;

	}
}
