package exceptionHandling;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        int x,y;
        System.out.println("Enter your two Dividing Number: ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        int []a=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        try{
            int results=x/y;
            System.out.println("Results: "+results);
            System.out.println("Enter your index");
            int n=sc.nextInt();
            System.out.println(a[n]);
        }
        catch (ArithmeticException ob1)
        {
            System.out.println("Cant divide by 0");
        }
        catch (ArrayIndexOutOfBoundsException ob2)
        {
            System.out.println("Invalid index");
        }
        finally {
            System.out.println("Hello it's minan code");
        }
    }
}
