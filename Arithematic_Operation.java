import java.util.Scanner;
public class Arithematic_Operation {
    public static void main(String[] args)
    {
        int a,b;
        int x,y,z,w;
        System.out.println("Enter your input");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        x=a+b;
        System.out.println("Addition :"+x);
        y=a-b;
        System.out.println("Subtraction :"+y);
        z=a*b;
        System.out.println("Multiplication :"+z);
        w=a/b;
        System.out.println("Divition :"+w);

    }
}
