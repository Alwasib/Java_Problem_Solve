import java.util.Scanner;
public class palindromeNumber {
    public static void main(String [] args)
    {
        int number;
        int reverse=0;
        int reminder=0;
        int original;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your input");
        number=sc.nextInt();
        original=number;

        while(number!=0)
        {
            reminder=number%10;
            reverse=reverse*10+reminder;
            number=number/10;
        }
        if(original==reverse)
        {
            System.out.println("your input is palindrome number");
        }
        else {
            System.out.println("your input is not palindrome number");
        }
    }
}
