package OOPJ;
import java.util.*;
import java.math.*;

class factorial{
    int n,i=1,fact=1;
    int factorialCompute(int n)
    {
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}

class printPrime
{
    int n,i;
    boolean isPrime(int a)
    {
        if(n<=1)
        {
            return false;
        }

        for (i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    void primes(int n)
    {
        for(i=1;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
}

public class Q1 {
    public static void main(String[] args)
    {
//        int i,f;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number to compute the factorial");
//        i= sc.nextInt();
//        factorial ob1=new factorial();
//        f=ob1.factorialCompute(i);
//       System.out.println("The factorial of  "+i+"  is  "+f);
        printPrime ob2=new printPrime();
        ob2.primes(100);
    }
}