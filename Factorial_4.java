
package factorial_4;

import java.util.Scanner;


public class Factorial_4 {

    
    public static void main(String[] args) {
       
     Scanner input = new Scanner(System.in);
        System.out.println("Enter the factorial number");
        int fact =  input.nextInt();
        int num =1;
        for (int i =1 ; i <= fact; i ++){
            num *=i;
            
        }
        System.out.println(num);
        
        
        
    }
}


