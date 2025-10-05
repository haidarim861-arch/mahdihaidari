
package leap_year;

import java.util.Scanner;


public class Leap_year {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" PLease Enter The Year");
        int year = input.nextInt();
        
        if ((year % 4 == 0  && year % 100 != 0) || ( year % 400 == 0 )){
            System.out.println(" This Year IS Leap");
    }
    else {
            System.out.println("This year Is Not Leap");
        }
    } 
}



            
        
       
        
    
    

