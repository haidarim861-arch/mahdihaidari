
package exsecise_2;

import java.util.Scanner;


public class Exsecise_2 {

   
    public static void main(String[] args) {
     
         Scanner input = new Scanner(System.in);
        System.out.println("please enter temperature in (celsius)");
        double celsius = input.nextDouble();
        double farnhait = (9*celsius)/5 +32;
        System.out.println("temperature in Farnhait is : "+farnhait);
        
        
        
        
    }
}
