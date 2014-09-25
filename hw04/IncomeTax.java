// Rob Weaver
// 10 September 2014
// CSE 02 hw04
// Income Tax Java Program

import java.util.Scanner;   // imports scanner utitily

//  define a class
    public class IncomeTax {
    
//      choose a main method
        public static void main(String[] args) {
            
//          create scanner called keyboard
            Scanner keyboard = new Scanner (System.in);
            
//          declare variables for future calculations
            double numThous;    // total dollars before tax
            double taxPercent;  // will be used to find tax on the numThous
            double totalTax;    // amount of tax that will have to be paid
            double tax; // variable that will change depending in the input using if and else
            
//          Prompt the user for number of thousands as an interger
            System.out.print("Enter an int giving the number of thousands: ");
            boolean bNum = keyboard.hasNextInt();   // save this value as a boolean for error testing
            
            if (bNum==true){    // if the boolean is true (number is an int) the following processes will take place
                
                int num = keyboard.nextInt();   // accepts value as an int for calculation
                
                if (num>=78){   // if the user entry is equal to or greater than 78, the following processes will take place
                tax = 14.0; // the tax is 14.0
                numThous = num*1000;    // convert thousands to dollars
                taxPercent = tax/100;   // finding tax rate
                totalTax = Math.round((taxPercent*numThous*100.0)/100.0);   // calculates total tax and rounds properly
                System.out.println("The tax rate on $"+numThous+" is "+tax+"% and the tax is "+totalTax);   // prints solution
                
                }else if (num>=40){ // if the user entry is equal to or greater than 40, but not equal to or greater than 78,
                tax = 12.0;         // the following processes will take place. same steps as above
                numThous = num*1000;
                taxPercent = tax/100;
                totalTax = Math.round((taxPercent*numThous*100.0)/100.0);
                System.out.println("The tax rate on $"+numThous+" is "+tax+"% and the tax is "+totalTax);
                
                }else if (num>=20){ // same steps
                tax = 7.0;
                numThous = num*1000;
                taxPercent = tax/100;
                totalTax = Math.round((taxPercent*numThous*100.0)/100.0);
                System.out.println("The tax rate on $"+numThous+" is "+tax+"% and the tax is "+totalTax);
                
                }else if (num>0){   // same steps
                tax = 5.0;
                numThous = num*1000;
                taxPercent = tax/100;
                totalTax = Math.round((taxPercent*numThous*100.0)/100.0);
                System.out.println("The tax rate on $"+numThous+" is "+tax+"% and the tax is "+totalTax);
               
                }else{
                System.out.println("Please enter a positive interger"); // error message if a non-interger is entered
                return;}
                
            }else{System.out.println("Please enter an interger");   // error message for if the boolean is false
                return;}
                
        }   // ends main method
          
    }   // ends class
               