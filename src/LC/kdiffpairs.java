package LC;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by seetharams on 4/4/17.
 */
public class kdiffpairs {

    public static void main(String[] args) {

        int[] a = {1,1,3,4,5};
        int k = 2;
        System.out.println(getK(a,k));

    }

    public static int getK(int[] a,int k) {
        int cnt = 0;
        if(k<0) return 0;
        int n = a.length;
        Arrays.sort(a);
        int st=0, end=1;
        Set<String> s = new HashSet<>();
        while(st < n && end < n) {
            int diff = a[end] - a[st];
            if(diff == k && st!=end){
                if(!s.contains(a[st] + "" + a[end])) cnt++;
                s.add(a[st] + "" + a[end]);
                st++;
                end++;
            }
            else if(diff > k){
                st++;
            }
            else end++;
        }
        return cnt;
    }
}

