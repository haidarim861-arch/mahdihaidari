/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapteo.number;

/**
 *
 * @author DEll
 */
public class SwapteoNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int x =10 , y =20;
  
  y = (x+y)-y;
  x = (x+y)-x;
  
        System.out.println("the value of x = "+ x);
        System.out.println("the value of y = "+ y);
        
          
    }
    
}
