package LC;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by seetharams on 28/3/17.
 */
public class IsomorphicStrings {
    //"qwertyuiop[]asdfghjkl;'\\zxcvbnm,./"
    //"',.pyfgcrl/=aoeuidhtns-\\;qjkxbmwvz"

    public static void main(String[] args) {

        System.out.println(isIsoMorphic("ab","aa"));
        //System.out.println(isIsoMorphic("qwertyuiop[]asdfghjkl;'\\\\zxcvbnm,./","',.pyfgcrl/=aoeuidhtns-\\\\;qjkxbmwvz"));

    }

    private static boolean isIsoMorphic(String s1, String s2) {

        int l1 = s1.length();
        int l2 = s2.length();
        if(l1 != l2) return false;

        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<l1;i++) {
            if(map.containsKey(s1.charAt(i))) {
                if(map.get(s1.charAt(i)) != s2.charAt(i))
                    return false;
            }
            map.put(s1.charAt(i),s2.charAt(i));
        }

        map.clear();


        for(int i=0;i<l2;i++) {
            if(map.containsKey(s2.charAt(i))) {
                if(map.get(s2.charAt(i)) != s1.charAt(i))
                    return false;
            }
            map.put(s2.charAt(i),s1.charAt(i));
        }


        return true;
    }


}
