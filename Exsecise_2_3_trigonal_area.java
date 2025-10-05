
package exsecise_2;

import java.util.Scanner;


public class Exsecise_2_3_trigonal_area {

   
    public static void main(String[] args) {
     
         Scanner input = new Scanner(System.in);
         System.out.println("enter the coordinat : x1");
       
       double x1 = input.nextDouble();
       System.out.println("enter the coordinat :x2");
       double x2 = input.nextDouble();
       System.out.println("enter the coordinat :x3");
       double x3 = input.nextDouble();
       System.out.println("enter the coordinat :y1");
       double y1 = input.nextDouble();
       System.out.println("enter the coordinat :y2");
       double y2 = input.nextDouble();
       System.out.println("enter the coordinat :y3");
       double y3 = input.nextDouble();
       double side1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
       double side2 = Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2) );
       double side3 = Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
       
       double s = (side1+side2+side3)/2;
       double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
       area = Math.round(area*100.0)/100.0;
       
               
        System.out.println("the area of trigonal is : "+area+"m^2");
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
