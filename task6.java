import java.util.Scanner;

public class task6 {

       public static void main(String args[])
{

       Scanner in = new Scanner(System.in);
       int choice;
       System.out.println("Please enter a choice");
       System.out.println("Menu");
       System.out.println("1.zinger-250/-");
       System.out.println("2.brost-300/-");
       System.out.println("3.clubsandwich-100/-");
       System.out.println("4.Exit");
       choice = in.nextInt();
       switch(choice)
       {
         case 1:
         System.out.println("zinger is chosen");
         System.out.println("zinger's price is 250/-");
         break;
         
         case 2:
         System.out.println("brost is chosen");
         System.out.println("brost's price is 300/-");
         break;
    
         case 3:
         System.out.println("clubsandwich is chosen");
         System.out.println("clubsandwich's sandwich is 100/-");
         break;
         default:
          System.out.println("Invalid item");
          } 
      } 
  }
               