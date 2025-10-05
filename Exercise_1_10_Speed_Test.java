
package exercise_1.pkg1.pkg13;

import java.util.Scanner;


public class Exercise_1_10{

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter the time ");//time to hour
        double time = input.nextDouble();
        
        System.out.println("please enter the distance");//distance to km
        double distance = input.nextDouble();
        double speed_km_h = distance/time;
        speed_km_h = Math.round(speed_km_h *100.0)/100.0;
        
        System.out.println("speed(km/h) : "+speed_km_h);
        
        
        
        
        
        
        
        
    }

    
}
