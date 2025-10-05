
package exercise_1.pkg1.pkg13;

import java.util.Scanner;


public class Exercise_1_8 {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
       
        System.out.println("please enter the Radius");
        double Radius=input.nextDouble();
        
        
        double Area = Math.PI*Radius*Radius;
        double perimeter = 2 * Math.PI*Radius;
        Area = Math.round(Area*100.0)/100.0;
        
        System.out.println("Area: "+Area);
        perimeter = Math.round(perimeter*100.0)/100.0;
        System.out.println("perimeter: "+perimeter);
       
        
        
        
        
    }

    
}
