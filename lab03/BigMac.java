// Rob Weaver
// 10 September 2014
// CSE lab03
// Big Mac Java Program

import java.util.Scanner;

//  define a class
    public class BigMac {
    
//      choose a main method
        public static void main(String[] args) {
            
//          scanner
            Scanner myScanner;
            myScanner new Scanner( System.in );
            System.out.print(
            "Enter the number of Big Macs(an interger > 0): ");

//          accept user input
            int nBigMacs = myScanner.nextInt();
            System.out.print("Enter the cost per Big Mac as"
            
//          user inputted constants
            System.out.print("Enter the cost per Big Mac as"+   
            " a double (in the form xx.xx) :"); // prompts for the cost of 1 Big Mac
            double bigMac$ = myScanner.nextDouble();    //declaration of the cost
            System.out.print(
                "Enter the percent tax as a whole number (xx): ");  // prompts user for tax percent
            double taxRate = myScanner.nextDouble();    // decleration of tax rate
            taxRate/=100;   //  converts whole number to a usable proportion
            
            
            
        }
    }