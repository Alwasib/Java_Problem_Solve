package exceptionHandling;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        while(true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your num1: ");
                int num1 = sc.nextInt();
                System.out.println("Enter your num2: ");
                int num2 = sc.nextInt();
                int results = num1 / num2;
                System.out.println("Results:" + num1 + "/" + num2 + "=" + results);
            } catch (Exception e) {
                System.out.println("Exception: " +e);
                System.out.println("You must enter integer try again");
            }
        }
    }
}
