
package taxes;

import java.util.Scanner;

public class Taxes {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        
         System.out.print("Enter the amount of salary in afghany:");
        double salary=input.nextDouble();
        double tax;
        
        
        if(salary<=5000){
            System.out.println("does not has tax.");
        }
        if (salary>5000  &&  salary<=12500){
            tax=(salary-5000)*2/100;
            System.out.println("the tax for this salary is : "+(int)tax+"Afghani");
        
        }
        if (salary>12500  &&  salary<=100000){
           double tax1=7500*0.02;
          double tax2=(salary-5000-7500)*0.1;
          tax=tax1+tax2;
            System.out.println("the tax for this salary is : "+(int)tax+"Afghani");
         

        }
         
         if (salary>100000 ){
            double tax1=7500*0.02;
            double tax2=87500*0.1;
            double tax3=(salary-5000-7500-87500)*0.2;
            tax=tax1+tax2+tax3;
             System.out.println("the tax for this salary is : "+(int)tax+"Afghani");

         }
         
     
     
     
    }
    
}
