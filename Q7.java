package OOPJ;
import java.util.*;
import java.lang.*;

interface test
{
    void square();
    void rect();
}

interface test2 extends test
{
    void circle();
}

class arithmetic implements test{
    Scanner sc=new Scanner(System.in);
    @Override
    public void rect() {
        System.out.println("This is class arithmetic rectangle");
        System.out.println("Enter the length of rectangle");
        int l,b;
        l=sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        b=sc.nextInt();
        System.out.println("The area of rectangle is  "+l*b);
    }
    public void square(){
        System.out.println("This is class arithmetic square");
        System.out.println("Enter the side of square");
        int s;
        s=sc.nextInt();
        System.out.println("The area of square is  "+ s*s);
    }
}

class toTestInt extends arithmetic
{
    @Override
    public void rect() {
        super.rect();
    }

    @Override
    public void square() {
        super.square();
    }
}

class newRope implements Runnable{
    Thread t;
    newRope()
    {
        System.out.println("This is ");
        t=new Thread();
        t.start();
    }
    public void run()
    {
        toTestInt obj=new toTestInt();
        obj.square();
    }
}

public class Q7 {
    public static void main(String[] args)
    {
        toTestInt obj=new toTestInt();
        obj.square();
      //  new newRope();
    }
}
