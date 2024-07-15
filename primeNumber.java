import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args)
    {
        int number;
        int c=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your input");
        number=sc.nextInt();
        if(number=='0'||number=='1')
        {
           c=1;
        }
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    c = 1;
                    break;
                }
            }
            if (c == 0) {
                System.out.println("your input is prime number");
            } else {
                System.out.println("your input is not prime number");
            }

    }
}
