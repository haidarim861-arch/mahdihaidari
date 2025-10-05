
package nutrul.adding;

 import java.util.Scanner;


public class NutrulAdding {

    
   
   
    public static void main(String[] args) {
    
         double s;
         double n;
         System.out.println("meqdar (n) ra wared koned :");
         Scanner input = new Scanner(System.in);
         n = input.nextDouble();
         
          s = n*(n+1)/2;
          System.out.println(" (S) is = "+ s);
    }
    
}
