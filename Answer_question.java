
package answer_question;

import java.util.Scanner;


public class Answer_question {

   
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int num1 =(int) (Math.random()*10);
int num2 = (int) (Math.random()*10);

        System.out.println("please answer the sum of"+num1+"+"+num2);
        int answer = input.nextInt();
        while ( num1+num2 !=answer){
            System.out.println("please answer the sum of"+num1+"+"+num2);
            answer =input.nextInt();
        }

        System.out.println("Got it your answer is corret");




    }
    
}
