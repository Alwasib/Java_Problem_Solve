import java.util.Scanner;
public class UserInput {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int id;
        String price,title,description,category;
        System.out.print("enter id :");
        id=sc.nextInt();
        System.out.println("id :"+id);

        System.out.println("enter price :");
        price=sc.nextLine();
        System.out.println("price :"+price);

        System.out.println("enter title :");
        title=sc.nextLine();
        System.out.println("title :"+title);

        System.out.println("enter description :");
        description=sc.nextLine();
        System.out.println("description :"+description);

        System.out.println("enter category :");
        category=sc.nextLine();
        System.out.println("title :"+category);
    }
}
