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
            myScanner = new Scanner( System.in );
            
//          user inputs
            System.out.print(
            "Enter the number of Big Macs(an interger > 0): "); //  asking user for the number of Big Macs
            int nBigMacs = myScanner.nextInt(); // declare that input as an interger nBigMacs
            
            System.out.print("Enter the cost per Big Mac as"+   
            " a double (in the form xx.xx) :"); // prompts for the cost of 1 Big Mac
            double bigMac$ = myScanner.nextDouble();    //declaration of the Big Mac cost as a variable
            
            System.out.print(
                "Enter the percent tax as a whole number (xx): ");  // prompts user for tax percent
            double taxRate = myScanner.nextDouble();    // decleration of tax rate
            taxRate/=100;   //  converts whole number to a usable proportion
            
//          eeclare variables for output and calculation
            double cost$;
            int dollars,dimes, pennies;  // make variables for dollars, dimes, and pennies for storing digits
            cost$=nBigMacs*bigMac$*(1+taxRate); //calculation for the cost of all Big Macs
            dollars=(int)cost$; //gets dollars as a whole interger
            dimes=(int)(cost$*10)%10;    //isolates one digit after the decimal place
            pennies=(int)(cost$*100)%10;    //isolates the second degit after the decimal place
            
//          print results
            System.out.println("The total cost of "+nBigMacs+" Big Macs, at $"+bigMac$+" per Big Mac, with a sales tax of "+(int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
            
        }
    }