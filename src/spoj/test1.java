package spoj;

import java.util.PriorityQueue;

/**
 * Created by seetharams on 24/11/16.
 */
public class test1 {

    public static void main(String[] args){
        System.out.println(obtainLargest(10));
    }


    public static int method() {


        return 0;

    }


    public static int obtainLargest(int num){
        String strNum = String.valueOf(num);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<strNum.length()-1; i++){
            String newString = i == 0 ? "" : strNum.substring(0,i);
            int sum = (strNum.charAt(i)-'0'+ strNum.charAt(i+1)-'0');
            int val = sum%2==0?sum/2:sum/2 + 1;
            newString += val + strNum.substring(i+2);
            int result = Integer.parseInt(newString);
            if(max < result)
                max = result;
        }
        return max;
    }
}
