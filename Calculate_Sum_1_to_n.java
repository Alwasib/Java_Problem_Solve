
import java.util.Scanner;
public class Calculate_Sum_1_to_n {
    public static void main(String[] args)
    {
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your input");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("your Addition :"+sum);
    }
}
