
package subtractionquizloop_ch4;
import java.util.Scanner;
public class SubtractionQuizLoop_ch4 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int correct = 0;

        long start = System.currentTimeMillis();
        for (int i = 1 ; i <= 5 ; i++){
            int A = (int)(Math.random()*101);
            int B = (int)(Math.random()*101);
            if ( A<B){
    int T  = A;A=B;B=T;}
        
        System.out.println("Question  "+i+":   " +A+" - " +B+" =  ");
        int answer = input.nextInt();
        if ( answer == A-B){
            System.out.println("Correct! \n");
          correct++;
        }else{System.out.println("Wrong! Answer' see you the correct is :"+(A - B)+"\n");
        };}
        long time  = (System.currentTimeMillis() - start)/ 1000;
            System.out.println("you Got "+"correct out of 5 : " + correct);
            System.out.println("Total Time is = "+time+"Seconds");
        }} 
        
        
        
       
            
            
 

