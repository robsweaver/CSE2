// Rob Weaver
// 16 September 2014
// CSE hw03
// Root Java Program

//  create a scanner to accept user input
import java.util.Scanner;

//  define a class
    public class Root {
        
//      create main method
        public static void main(String[] args) {
            
//          scanner
            Scanner myScanner;
            myScanner = new Scanner( System.in );
            System.out.print(
            "Enter a double, and I print the cube root: "); //  prompts the user for counts
            double number = myScanner.nextInt();      
            
//          computations to make several
            System.out.println("The cube root is"+Math.pow(number,.3333));
            
        }
    }
