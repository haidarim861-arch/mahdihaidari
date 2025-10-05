
package mbi_checker;
import java.util.Scanner;

public class MBI_Checker {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Weight (KG)");
        
        double weight = input.nextDouble();
        
         System.out.println("PLease Enter your haight(CM)");
         
         double haight = input.nextDouble();
         
         double bmi = (weight / (haight * haight))*10000;
         System.out.println("your bmi is : "+bmi);
         if ((bmi  <= 18.5)){
             System.out.println(" you are little weight");
             
         }
         else if ((bmi < 25)){
             System.out.println("your weight is normal");
             
         }
         else if ((bmi <30)){
             System.out.println("your are Fat ");
    }
         else if ((bmi > 30)){
             System.out.println("you are very Fat it`s Dangerious");
         }
         else {
             System.out.println("unpossible");
         } 
    }
}
         
        





