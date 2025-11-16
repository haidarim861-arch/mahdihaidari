
package find.the.unicode.of.a.character;

import java.util.Scanner;

public class FindTheUnicodeOfACharacter {

    public static void main(String[] args) {
        
//        Question 4.9 page 154
//        (Find the Unicode of a character) Write a program that receives a character and 
//        displays its Unicode
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character : ");
        String s = input.next();
        char c = s.charAt(0);
        int Ascii = (int)c;
        System.out.printf("The unicode for character %c is %d \n", c, Ascii);
        
//        Question 4.8 page 153
//        (Find the character of an ASCII code) Write a program that receives an ASCII code 
//        (an integer between 0 and 127) and displays its characte.
        
        System.out.print("Enter an ASCII code: ");
        int ascii = input.nextInt();
        char ch = (char)ascii;
        System.out.printf("The character for ASCII code %d is %c \n", ascii, ch);
    }
    
}
