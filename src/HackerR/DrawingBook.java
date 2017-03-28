package HackerR;

/**
 * Created by seetharams on 20/12/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DrawingBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        if(n == p) { System.out.println(0); return; }
        // your code goes here
        int tl = p/2;
        n = n/2;
        int min = Math.min(tl, n - tl);
        System.out.println(min);

    }
}

