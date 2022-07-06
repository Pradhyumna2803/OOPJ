package OOPJ;
import java.util.Scanner;

class Student
{
    String usn,name,branch;
    int phno;
    void studentDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        name=sc.nextLine();
        System.out.println("Enter the USN");
        usn=sc.nextLine();
        System.out.println("Enter the Branch");
        branch=sc.nextLine();
        System.out.println("Enter the Phone number");
        phno=sc.nextInt();
    }

    void  display()
    {
        System.out.println("The Student Details are");
        System.out.println("Name:"+name);
        System.out.println("USN:"+usn);
        System.out.println("Branch: "+branch);
        System.out.println("Phone no: "+phno);
    }

}

public class Q3 {
    public static void main(String[] args)
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students");
        n=sc.nextInt();
        //Student st[]=new Student[n];
        Student st=new Student();
        for(i=1;i<n+1;i++)
        {
            st.studentDetails();
            st.display();
        }
    }
}
