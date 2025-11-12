
package guess_number_ch5;

import java.util.Scanner;


public class Guess_Number_ch5 {

   
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Guess number between 1 ------  100");
        int number  = (int)(Math.random()*101);
        
       int guess = -1;
        while(guess !=number ){
            System.out.println(" Enter your guess");
            guess = input.nextInt();
        if (number == guess ){
            System.out.println("your Guess is correct "+number);
            
        }else if (guess> number){
            System.out.println("is too high");

        }else{
            System.out.println("it`S too lowe");
        
        }}
    }
    
}
