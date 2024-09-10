import java.util.Scanner;
public class Installment {
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        int phonePrice = 1800;
        int numberOfInstallment,numberOfMonth;
        System.out.print("number of month :");
        numberOfMonth=sc.nextInt();
        numberOfInstallment=1800/numberOfMonth;
        System.out.println("number of installment :"+numberOfInstallment);

        double base,height,area;
        System.out.print("enter base :");
        base=sc.nextDouble();
        System.out.print("enter height :");
        height=sc.nextDouble();
        area=0.5*base*height;
        System.out.println("are of triangle   :"+area);

        int farenhite;
        double celcius;
        System.out.print("enter farenhite :");
        farenhite=sc.nextInt();
        celcius=(farenhite-32);
        celcius= 1.8 *celcius;

        System.out.print("celcius :"+celcius);
    }
}
