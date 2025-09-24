
package lattery;

   import java.util.Scanner;
   import java.util.Random;

public class Lattery {

    
    public static void main(String[] args) {
      
         Random rand = new Random();
         
         int lottery = rand.nextInt(900)+100;
           
         Scanner input = new Scanner(System.in);
         System.out.println("Please Enter your Number ");
         int guess = input.nextInt();
       
         
         
          int l1 = lottery /100;
          int l2 = lottery / 10 %10;
          int l3 = lottery %10;
          
          int g1 = guess / 100;
          int g2 = guess /10 %10;
          int g3 = guess %10;
          System.out.println("The lottery number is "+lottery);
          
          if ((guess == lottery)) {
              System.out.println("you win 10000$");
          }
              else if ((g1 == l1 || g1 == l2 || g1 == l3) && (g2 == l1 || g2 == l2 || g2 == l3) && (g3 == l3 || g3 == l2 || g3 ==l3)){
                      System.out.println("you win 3000$");
                      
                      }
              else if ((g1 == l1 )||(g2 == l2)||(g3 == l3)){
                  System.out.println(" you win 1000$ ");
              }
              else {
                  System.out.println(" you lose");
          }
          
          
         
         
        
        
        
        
     
     
        
    }
    
}
