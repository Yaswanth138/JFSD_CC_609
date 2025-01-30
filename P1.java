import java.util.Scanner;
public class P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name;
        int age;
        float cgpa;
        char grade;
        System.out.println("Enter your Name");
        name=sc.nextLine();
        System.out.println("Enter Your age");
        age=sc.nextInt();
        System.out.println("Enter Your CGPA");
        cgpa=sc.nextFloat();
        System.out.println("Enter your Grade");
        grade=sc.next().charAt(0);
        System.out.println("Name:"+name);
        System.out.println("age:"+age);
        System.out.println("CGPA:"+cgpa);
        System.out.println("Grade:"+grade);
    }
}