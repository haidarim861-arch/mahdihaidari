
package dec2hex;

import java.util.Scanner;


public class Dec2Hex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please Enter decimal number");
        int dic  = input.nextInt();
        String hex = "";
        while (dic !=0){
            int hexvalue = dic % 16;
            char hexdigit = (hexvalue >=0 && hexvalue <=9)?
                    (char)(hexvalue + '0'):(char)(hexvalue - 10 +'A');
            hex = hex+hexdigit;
            dic = dic /16;
        }
        
        System.out.println("Hex number is :"+ hex);
    }
    
}
