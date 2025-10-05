
package exercise_1.pkg1.pkg13;

import java.util.Scanner;


public class Exercise_1_9 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("please enter width");
        double width = input.nextDouble();
        System.out.println("please enter height");
        double height = input.nextDouble();
        double Area = width*height;
        double perimeter = 2* (width*height);
        Area = Math.round(Area*100.0)/100.0;
        perimeter = Math.round(perimeter*100.0)/100.0;
        System.out.println("Area is ;"+Area+" cm");
        System.out.println("perimeter is :"+perimeter+" cm");
        
        
        
        
        
        
        
        
        
        
    }

    
}
