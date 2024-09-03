import java.util.Scanner;
public class Odd_even_addition {
    public static void main(String [] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                a[i]=a[i]+10;
                System.out.println(a[i]);
            }
            else if(a[i]%2==1)
            {
                a[i]=a[i]+5;
                System.out.println(a[i]);

            }
        }
    }
}
