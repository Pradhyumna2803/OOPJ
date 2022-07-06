package OOPJ;
import java.util.*;

//interface test
//{
//    public void getSquare();
//    public void getRect();
//    public void getCircle();
//}
//
//class arithmetic implements test
//{
//    Scanner sc=new Scanner(System.in);
//    public void getSquare()
//    {
//        int s;
//        System.out.println("Enter size of side");
//        s=sc.nextInt();
//        System.out.println("Area of square is  "+s*s);
//    }
//    public void getRect() {
//        int l,b;
//        System.out.println("Enter length");
//        l=sc.nextInt();
//        System.out.println("Enter breadth");
//        b=sc.nextInt();
//        System.out.println("Area of rectangle is  "+l*b);
//    }
//
//    public void getCircle()
//    {
//        int r;
//        System.out.println("Enter radius of circle");
//        r=sc.nextInt();
//        System.out.println("Area of circle is  "+3.14*r*r);
//    }
//    void vol()
//    {
//        System.out.println("Volume is created in this function");
//    }
//    public void getRect(String st)
//    {
//        System.out.println("The color of Rectangle is  "+st);
//    }
//}
//
//class col extends arithmetic
//{
//    Scanner sc=new Scanner(System.in);
//    void getColor()
//    {
//        System.out.println("Enter the color");
//        String colr=sc.nextLine();
//        super.getRect();
//        super.getRect(colr);
//    }
//}
//
//class arithmetic1 implements test
//{
//    Scanner sc=new Scanner(System.in);
//    @Override
//    public void getRect() {
//        System.out.println("This is method of arithmetic1 class");
//        System.out.println("Enter length");
//        int l=sc.nextInt();
//        System.out.println("Enter breadth");
//        int b=sc.nextInt();
//        System.out.println("Area is  "+l*b);
//    }
//    public void getSquare(){
//        int s;
//        System.out.println("This is method of arithmetic1 class");
//        System.out.println("Enter size of side");
//        s=sc.nextInt();
//        System.out.println("Area of square is  "+s*s);
//    }
//    public void getCircle()
//    {
//        int r;
//        System.out.println("This is method of arithmetic1 class");
//        System.out.println("Enter radius of circle");
//        r=sc.nextInt();
//        System.out.println("Area of circle is  "+3.14*r*r);
//    }
//}
//
//class toTestInt extends arithmetic1
//{
//    @Override
//    public void getRect() {
//        super.getRect();
//    }
//
//    @Override
//    public void getCircle() {
//        super.getCircle();
//    }
//
//    @Override
//    public void getSquare() {
//        super.getSquare();
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
////        arithmetic obj=new arithmetic();
////        obj.getSquare();
////        col obj1=new col();
////        obj1.getColor();
//
//        test ob1=new arithmetic();
//        toTestInt ob2=new toTestInt();
//        ob1=ob2;
//        ob1.getCircle();
//    }
//}


import java.util.Scanner;

class myexp extends Exception
{
    myexp(String s)
    {
        super(s);
    }
}

class demo
{
    Scanner sc=new Scanner(System.in);
    void demothrow()
    {
        System.out.println("Enter a   ");
        int a=sc.nextInt();
        try {
            int b=97/a;
            try
            {
                if(a==1)
                {
                    int c[]={1};
                    c[23]=1;
                }
                if(a==2)
                {
                    throw new myexp("This is sample of my exception");
                }
            }catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Caught    "+e);
            }
            catch (myexp e)
            {
                System.out.println("Caught my new exception");
            }
        }catch (ArithmeticException e)
        {
            System.out.println("Caught and Rethrowing  "+e);
            throw e;
        }
    }

}
public class Prgm89{
    public static void main(String[] args)
    {
//        try
//        {
//            throw new myexp("This is my exception");
//        }catch(myexp e)
//        {
//            System.out.println("I have caught my exception");
//        }
        try {
            demo obj=new demo();
            obj.demothrow();
        }catch (Exception e)
        {
            System.out.println("Caught exception using generic exception");
        }
    }
}