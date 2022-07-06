package OOPJ;
import java.math.*;
import java.util.Scanner;


class newThread1 extends Thread{
    Thread t;
    newThread1()
    {
        //t=new Thread();
        super();
        System.out.println("Child thread created");
        start();
    }
    synchronized public void run()
    {
        int i;
        try
        {
            for(i=0;i<=5;i++)
            {
                int n=(int) (Math.random()*(400-100+1)+100);
                System.out.println(n);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e)
        {
            System.out.println("Interrupted child thread");
        }
        System.out.println("Child thread exiting");
    }
}

class newThread2 extends Thread{
     Thread t;
     newThread2(){
//         t=new Thread();
         super();
         System.out.println("Child thread2 created");
         start();
     }
     synchronized public void run(){
         int i;
         try{
             for(i=0;i<=5;i++)
             {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter a number");
                 int n=sc.nextInt();
                 System.out.println("Square of "+n+" is "+n*n);
                 Thread.sleep(1000);
             }
         }catch (InterruptedException e)
         {
             System.out.println("interrupted");
         }
         System.out.println("Child thread2 exiting");
     }
}

class newThread3 extends Thread{
    newThread3()
    {
        super();
        System.out.println("Child thread 3 created");
        start();
    }
    synchronized public void run(){
        int i;
        try
        {
            int n;
            Scanner sc=new Scanner(System.in);
            for(i=0;i<=5;i++)
            {
                System.out.println("Enter the number");
                n=sc.nextInt();
                System.out.println("The cube of  "+n+" is  "+n*n*n);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("Child thread 3 exiting");
    }
}

public class Q10 {
    public static void main(String[] args)
    {
        new newThread1();
        new newThread2();
        new newThread3();
        try
        {
            int i;
            for(i=0;i<=5;i++)
            {
                //System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("Main interrupted");

//        System.out.println(n);

    }
}
