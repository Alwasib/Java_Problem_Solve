import java.util.Scanner;
public class rightTriangles {
    public static void main(String [] args)
    {
        int height;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your input");
        height=sc.nextInt();
        for(int i=1;i<=height;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" # ");
            }
            System.out.println();
        }
    }
}
