
package chines_zudiak;
import java.util.Scanner;


public class Chines_zudiak {

    
    public static void main(String[] args) {
        
      
        Scanner input = new Scanner(System.in);
   System.out.println(" Please Enter your born YEAR");
         int year = input.nextInt()%12 ;
         
      
         
         switch (year) {
             case 0:
             
                 System.out.println("Mokey");
                 break;
             case 1:
                 System.out.println("Rooster");
                 break;
             case 2 : 
                 System.out.println("Dog");
 break;            
             case 3:
                 System.out.println("pig");
                 break;
                 case 4:
                 System.out.println("Rat");
                 break;
                 case 5:
                 System.out.println("ox");
                 break;
                 case 6:
                 System.out.println("tiger");
                 break;
                 case 7:
                 System.out.println("rabbit");
                 break;
                 case 8:
                 System.out.println("dragon");
                 break;
                 case 9:
                 System.out.println("snake");
                 break;
                 case 10:
                 System.out.println("horse");
                 break;
                 case 11:
                 System.out.println("shep");
                 break;
                 
                 
         }
                     System.out.println("chines zudiak is" +year);
                     
                 
                 
                 
         }
                 

    




    }
    

