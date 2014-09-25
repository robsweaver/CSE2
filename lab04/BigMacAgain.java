// Rob Weaver
// 10 September 2014
// CSE lab04
// 2nd Big Mac Java Program

import java.util.Scanner;   // importing scanner utility

//  define a class
    public class BigMacAgain {
    
//      choose a main method
        public static void main(String[] args) {
            
//          create scanner called myScanner
            Scanner myScanner;
            myScanner = new Scanner( System.in );
            
//          variables
            double costPerBigMac$=2.22; // constant cost of each Big Mac
            double burgersCost$;    //  total cost of burgers TBD
            int nBigMacs;   //  user inputted number of Big Macs
            double friesCost$=2.15; //  constant cost of fries
            double totalCost$;  // total cost including fries if they are purchased
            
//          prompt 1                
            System.out.print(
            "How many Big Macs would you like: "); //  prompting user for the number of Big Macs
            boolean bBigMacs = myScanner.hasNextInt();  //  saves user input as a boolean      
           
        
            if (bBigMacs == true){  // if the boolean is true (has an interger),
                
                nBigMacs = myScanner.nextInt(); // nBigMacs is the name of the interger
            
                if (nBigMacs > 0){  //  if the interger is entered correctly, the following processes will take place
        
                    burgersCost$= Math.round(nBigMacs*costPerBigMac$*100.0)/100.0; // will calculate total cost of burgers and round
                    System.out.println(nBigMacs+" Big Macs will cost $"+burgersCost$);}   // prints total cost of burgers
                
                else{System.out.println("Please enter an interger > 0");   // tells user that input was not >0, so it is not acceptable
                    return;} // ends program
                
            }else{System.out.println("Please enter an interger");   // tells user that the input was not an interger, so not acceptable
                return;}    // ends program
                
//          prompt 2 
            System.out.print("Would you like fries with your meal? Enter Y/y/N/n: ");   // prompts the user for a String
            String sFries = myScanner.next();   // declares that the inputted value is a string
            
            if (sFries.equals("Y")){    // if the string is "Y",
                System.out.println("You ordered fries at the cost of: "+friesCost$);    //prints the cost of fries
                totalCost$=friesCost$+burgersCost$; // calculates total cost with fries
                System.out.println("The total cost of the meal is: "+totalCost$);}  // displays total cost
            
            else if (sFries.equals("y")){   // if the string is "y", the same processes will take place as "Y"
                System.out.println("You ordered fries at the cost of: "+friesCost$);
                totalCost$=friesCost$+burgersCost$;
                System.out.println("The total cost of the meal is: "+totalCost$);}
                
            else if (sFries.equals("N")){   // if the string is "N",
                System.out.println("The total cost of the meal is: "+burgersCost$);}    // prints the cost of the burgers alone
            
            else if (sFries.equals("n")){   // if the string is "n", same actions as "N" are taken
                System.out.println("The total cost of the meal is: "+burgersCost$);}
                
            else{   // if none of the above responses are inputted,
                System.out.println("You did not enter Y/y/N/n");    // prints error
                return;}    // ends program
                
        }        
    }        
    