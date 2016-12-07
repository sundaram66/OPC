import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TriangleMaking {
	
	public int maxPerimeter(int a, int b, int c) {

		int max = Math.max(Math.max(a, b), c);
		int peri = 0;

		if(max == a) {
			peri = b+c;

		}
		else if(max == b) {
			peri = a+c;
		}
		else if(max == c) {
			peri = a+b;
		}

		while(peri <= max) {
			max--;
		}

		return peri+max;


	}
}
