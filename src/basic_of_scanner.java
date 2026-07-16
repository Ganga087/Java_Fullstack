import java.util.Scanner;

public class basic_of_scanner {
    public static void main(String[] args)
    {
        int age;
        String name , branch;
        double cgpa;
        System.out.println("Enter ur Name :");
        Scanner sc = new Scanner(System.in);
        name =sc.nextLine();
        System.out.println("Enter Age :");
        age =sc.nextInt();
        System.out.println("Enter ur branch :");
        branch =sc.next();
        System.out.println("Enter ur cgpa:");
        cgpa =sc.nextDouble();
        System.out.println("My name is :"+name);
        System.out.println("Iam " + age+"years old");
        System.out.println("My branch is :"+ branch);
        System.out.println("My CGPA is :"+cgpa);
    }
}
