import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SRMCards {
	
	public int maxTurns(int[] cards) {

		Arrays.sort(cards);
		int turns = 0;
		int n = cards.length;

		for(int i=0;i<n;i++) {

			if( i < n-1 && cards[i+1]-1 == cards[i]) {
				i++;
				turns++;
			}
			else turns++;
		}

		return  turns;
	}
}
