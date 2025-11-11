
package remainderfinder;

import java.util.Scanner;


public class Remainderfinder {

    
    public static void main(String[] args) {
             Scanner input = new Scanner (System.in);
        System.out.println("please Enter a Digit");
        int num = input.nextInt();
        int sum = 0;
        int Remainder ;
        
        while (num >0){
         Remainder = num % 10;
         sum +=Remainder;
      num=   num %10 ;
        }
        System.out.println(sum);
    }
    
}
