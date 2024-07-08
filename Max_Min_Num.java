import java.util.Scanner;
public class Max_Min_Num {
    public static void main(String[] args) {
        int i, n,max,min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        n = sc.nextInt();
        int []a=new int [n];
        System.out.println("Enter your all nth input");
        for (i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
       max=a[0];
        min=a[0];
        for(i=1;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Maximum :"+max);
        System.out.println("Minimum :"+min);
    }
}
