package LC;

import java.util.*;
class FizzBuzz
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        for(int i=1;i<=n;i++)
        {
            if((i%3==0)&&(i%5==0))
            System.out.println("LC.FizzBuzz");
            else if(i%5==0)
                System.out.println("Buzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else System.out.println(i);
        }
    }
}