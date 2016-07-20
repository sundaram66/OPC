import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearNSWE {
	
	public double totalDistance(int[] a, String dir) {

		double dist = 0;
		int n = a.length;
		int ns = 0, ew=0;

		for(int i=0;i<n;i++) {
			dist += a[i];

			if(dir.charAt(i) == 'N') {
					ns += a[i];
			}
			else if(dir.charAt(i) == 'S') {
					ns -= a[i];
			}
			else if(dir.charAt(i) == 'W') {
					ew += a[i];
			}
			else {
					ew -= a[i];
			}
		}

		double sq = ew*ew + ns*ns;
		dist += Math.sqrt(sq);
		return dist;


	}
}
