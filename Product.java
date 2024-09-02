import java.util.Scanner;
public class Product {
    public static void main(String [] args)
    {
        int id;
        System.out.println("Enter your id :");
        Scanner sc= new Scanner(System.in);
        id=sc.nextInt();
        System.out.print("your id is: ");
        System.out.println(id);
        System.out.println("Title : Iphone15");
        System.out.println("Price: 1500 euros");
        System.out.println("Description : Best product with image quality");
        System.out.println("Category : phone");

    }
}
