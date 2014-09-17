// Rob Weaver
// 16 September 2014
// CSE hw03
// Root Java Program

//  import scanner to accept user input
import java.util.Scanner;

//  define a class
    public class Root {
        
//      create main method
        public static void main(String[] args) {
            
//          create scanner
            Scanner myScanner;
            myScanner = new Scanner( System.in );
            
//          prompt user for input
            System.out.print(
            "Enter a double, and I print the cube root: "); //prompts the user for a number to cube root
            double number = myScanner.nextInt();    //declare 'number' as the user inputted variable      
            
//          compute and print result
            System.out.println("The cube root is "+Math.pow(number,.3333));
            
        }
    }
