package OOPJ;
import java.util.*;

class overload
{
    int a;
    int b;
    Scanner sc=new Scanner(System.in);
    overload()
    {
        System.out.println("This is constructor of super class,Enter values of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
    }

    overload(int m,int n)
    {
        a=m;
        b=n;
    }
    void printvalues()
    {
        System.out.println("This is the method of super class");
        System.out.println("Value of a is  "+a);
        System.out.println("Value of b is  "+b);
    }

    void printvalues(int a,int b)
    {
        System.out.println("This is the method of super class");
        System.out.println("The value of a is  "+a);
        System.out.println("The value of b is  "+b);
    }

    void printvalues(double a,double b)
    {
        System.out.println("This is the method of super class");
        System.out.println("The value of a is  "+a);
        System.out.println("The value of b is  "+b);
    }
}

class override extends overload
{
    int a;
    int b;
    Scanner sc=new Scanner(System.in);
    //System.out.println("This class is inherited from overload class");
    override()
    {
        a=10;
        b=10;
    }

    override(int a,int b)
    {
        System.out.println("This is the constructor of subclass,Enter values of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
    }

    void printvalues(int a,int b)
    {
        int x,y;
        System.out.println("This is the method of subclass");
        System.out.println("Value of a is  "+a);
        System.out.println("Value of b is  "+b);

    }
}

//
////NEW Program For Question 5
//
//class asection
//{
//    String usn;
//    int sem;
//    int  gpa;
//    Scanner sc=new Scanner(System.in);
//    asection()
//    {
//        usn="000";
//        sem=0;
//        gpa=0;
//    }
//    asection(String usn,int sem,int  gpa)
//    {
//        this.usn=usn;
//        this.sem=sem;
//        this.gpa=gpa;
//    }
//
//    void inputNames()
//    {
//        System.out.println("Enter the details of the studenet");
//        usn=sc.nextLine();
//        sem=sc.nextInt();
//        gpa=sc.nextInt();
//    }
//
//    void outputDetails()
//    {
//        System.out.println("The details of student are");
//        System.out.println("USN "+usn);
//        System.out.println("SEM  "+sem);
//        System.out.println("GPA  "+gpa);
//    }
//}
//
//class subDetails extends asection
//{
//    String sub,cc;
//    Scanner sc=new Scanner(System.in);
//
//    subDetails()
//    {
//        sub="MATHS";
//        cc="MA1";
//    }
//
//
//    subDetails(String sub,String cc)
//    {
//        this.sub=sub;
//        this.cc=cc;
//    }
//
//
//    void inputNames()
//    {
//        System.out.println("Enter the subject name & course code");
//        sub=sc.nextLine();
//        cc=sc.nextLine();
//    }
//
//    void outputDetails()
//    {
//        System.out.println("The details of the subject are");
//        System.out.println("Course name   "+sub);
//        System.out.println("Course code   "+cc);
//    }
//
//
//}
//
//class modules extends subDetails
//{
//    int noOfModules;
//
//    modules(String usn,int sem,int gpa,String sub,String cc,int noOfModules)
//    {
//       // super(usn,sem,gpa,sub,cc);
//        super.usn=usn;
//        super.sem=sem;
//        super.gpa=gpa;
//        super.sub=sub;
//        super.cc=cc;
//        this.noOfModules=noOfModules;
//    }
//    void outputDetails()
//    {
//        System.out.println("The details are");
//        System.out.println("USN  "+super.usn);
//        System.out.println("SEM  "+super.sem);
//        System.out.println("GPA  "+super.gpa);
//        System.out.println("COURSE NAME  "+super.sub);
//        System.out.println("COURSE CODE  "+super.cc);
//        System.out.println("NO. of Modules  "+this.noOfModules);
//    }
//}
//
//


//class trying
//{
//    static  void demoproc() throws NullPointerException
//    {
//        try
//        {
//            throw NullPointerException("Demo");
//        }
//        catch (NullPointerException e)
//        {
//            System.out.println("Caught in demoproc");
//            throw e;
//        }
//    }
//
//}

public class Q4Q5 {

    public static void main(String[] args) {
        // write your code here

        // QUESTION NO. 4
        overload obj1=new overload();
        obj1.printvalues();

        System.out.println("Overriding");
        override obj2=new override();
        obj2.printvalues(45,78);




//        QUESTION NO 5   Implementing inheritance
//
//
//        asection obj=new asection("AB de Villiers",4,8);
//        obj.outputDetails();
//
//
//        subDetails sub=new subDetails("OOPJ","ISE4");
//        sub.outputDetails();
//
//        subDetails sub2=new subDetails();
//        sub2.inputNames();
//        sub2.outputDetails();
//
//
//
//
//      modules m1=new modules("4ni20is1",4,9,"OOPJ","ISE22",5);
//        m1.outputDetails();


    }
}
