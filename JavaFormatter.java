import java.util.*;

public class JavaFormatter
{
   public static void main(String args[])
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Welcome to ithe java output formatting class.");
      System.out.println("Name: ");
      String name = scan.nextLine();
      
      System.out.printf("Hello new comer %s", name);
      
      System.out.println("Let me take your personal information");
      System.out.println("Your age: ");
      int age = scan.nextInt();
      System.out.println("Range for elaun you dream: ");
      float elaun = scan.nextFloat();
      System.out.println("okay that's it");
      System.out.println();
      System.out.printf("This what we collect %s %d %.2f\n", name, age, elaun);
   }

}