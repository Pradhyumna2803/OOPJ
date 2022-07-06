package OOPJ;
import java.util.Scanner;

class MultidimensionalArray
{
    void createDisplayArr(int row,int col)
    {
        int[][] a=new int[row][col];
        System.out.println("Enter the array elements");
        int i,j;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                Scanner sc= new Scanner(System.in);
                a[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(i=0;i<row;i++)
        {
            for (j=0;j<col;j++)
            {
                sum=sum+a[i][j];
            }
        }
        System.out.println("Sum of 2d array is  "+sum);
    }
}

class OneDimensionalArray{
    void create1darray(int n)
    {
        int[] a=new int[n];
        System.out.println("Enter the array elements");
        int i;
        for (i=0;i<n;i++)
        {
            Scanner sc=new Scanner(System.in);
            a[i]= sc.nextInt();
        }
        int sum=0;
        for (i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum of 1D array is  "+sum);
    }
}

public class Q2 {
    public static void main(String[] args) {
        // write your code here
        //code for 2d array
        int r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        r = sc.nextInt();
        System.out.println("Enter the number of columns");
        c = sc.nextInt();
        MultidimensionalArray Arr = new MultidimensionalArray();
       Arr.createDisplayArr(r, c);

       //code for 1d array
//        int n;
//        System.out.println("Enter the no. of elements");
//        n=sc.nextInt();
//        OneDimensionalArray arr=new OneDimensionalArray();
//        arr.create1darray(n);
    }
}
