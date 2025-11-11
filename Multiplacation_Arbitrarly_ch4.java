
package multiplacation_arbitrarly_ch4;

import java.util.Scanner;


public class Multiplacation_Arbitrarly_ch4 {

   
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        System.out.println("Are you ready for watch the table");
int stt  = input.nextInt();
        for (int i = 1; i <= stt; i++) {
            for (int j = 1; j <=stt; j++) {
                System.out.printf("%4d",i*j);
                
                
                
            }
            System.out.println();
            
            
            
        }
        
        
        
        
    }
}

    }
    
}
