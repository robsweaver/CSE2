// Rob Weaver
// 16 September 2014
// CSE hw03
// Root Java Program

//  create a scanner
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

//          variables
            double guess;
            double guess1;
            double guess2;
            double guess3;
            double guess4;
            
//          computation
            guess=number/3;
            guess1=(guess*guess*guess+number)/(3*guess*guess);
            guess2=(guess1*guess1*guess1+number)/(3*guess1*guess1);
            guess3=(guess2*guess2*guess2+number)/(3*guess2*guess2);
            guess4=(guess3*guess3*guess3+number)/(3*guess3*guess3);
            
//          print output
            System.out.println("The cube root is "+guess4);
            
        }
    }
