package Sample;

import java.util.Arrays;
import java.util.Comparator;


class Suffix {
    int index;
    int[] rank = new int[2];
    String s;
}

public class SuffixArray1 {

    public static void main(String[] args) {

        String in = "mississipi";
        int n = in.length();

        Suffix suffix[] = new Suffix[n];
        for(int i=0;i<n;i++) {
            suffix[i] = new Suffix();
        }

        for(int i=0;i<n;i++) {
            suffix[i].index = i;
            suffix[i].s = in.substring(i);
        }

        Arrays.sort(suffix, new Comparator<Suffix>() {
            @Override
            public int compare(Suffix o1, Suffix o2) {
                return o1.s.compareTo(o2.s);
            }
        });

        for (int i=0;i<n;i++) {
            System.out.println(suffix[i].s);
        }
    }
}
