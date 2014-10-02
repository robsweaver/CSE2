// Rob Weaver
// 30 September 2014
// CSE 02 Homework 5
// Boola Boola Java Program

import java.util.Scanner;    // imports scanner utility

public class BoolaBoola {  // creates a class named BoolaBoola
    
    public static void main (String[] args) {   // creates main method
    
        Scanner myScanner = new Scanner (System.in);    // creates scanner called myScanner
        
        boolean firstBoolean;   // declares firstBoolean as a boolean
        boolean secondBoolean;  // declares secondBoolean as a boolean
        boolean thirdBoolean;   // declares thirdBoolean as a boolean
        
        double rando1 = Math.random();  // genearates random number
        if (rando1 > 0.5){  // if the number is greater than 0.5,  
            firstBoolean = true;    // the first boolean of the later equation is true
            
        }else {firstBoolean = false;}   // if it is not, it is false
        
        double rando2 = Math.random();  // same process for the second boolean
        if (rando2 > 0.5){
            secondBoolean = true;
            
        }else {secondBoolean = false;}
            
        double rando3 = Math.random();  // same process for the third boolean
        if (rando3 > 0.5){
            thirdBoolean = true;
            
        }else {thirdBoolean = false;}   
            
        String stringOperator1; // creates a string to represent the operator
        String stringOperator2; // creates a string to represent the second operator in the later equation
        
        boolean operator1;  // creates the first operator
        if (Math.random() > 0.5){   // random number has a 50/50 chance of being true, thus being "or"
            operator1 = true;
            stringOperator1 = "||";
            
        }else {operator1 = false;   // also 50/50 chance of being false
            stringOperator1 = "&&";}    // and being an "and"
        
        
        boolean operator2;  // creates second operator
        if (Math.random() > 0.5){   // if the random number is greater than 0.5,
            operator2 = true;   // the second operator is true and a "or"
            stringOperator2 = "||";
            
        }else {operator2 = false;   // if it is false,
            stringOperator2 = "&&";}    // the operator is "and"
         
        // equation for the user to see    
        System.out.print("Does "+firstBoolean+" "+stringOperator1+" "+secondBoolean+" "+stringOperator2+" "+thirdBoolean+" have the same value true (T/t) or false (F/f)?: ");
        
        
        boolean bEntry; // declares an entry boolean
 
    
        String entry = myScanner.next();    // accepts next string as an input
        if (entry == "T"){  // accepts "T" as a true boolean
            bEntry = true;
        }else if (entry == "t"){    // accepts "t" as a true boolean
            bEntry = true;  
        }else if (entry == "F"){    // accepts "F" as a false boolean
            bEntry = false;
        }else if (entry == "f"){    // accepts "f" as a false boolean
            bEntry = false;
        }else {System.out.print("Incorrect try agizain");}  // prints error if neither are inputted
        
       
        if (operator1 = true){   // if the first operator is an "or"
            if (operator2 = true){  // and the second operator is an "or"
                boolean answer = firstBoolean || secondBoolean || thirdBoolean; // this will be calculated
            } else if (operator2 = false){  // if the second operator is "and"
                boolean answer = firstBoolean || secondBoolean && thirdBoolean;}    // this will be calculated
        }else if (operator1 = false){   // if the first operator is "and"
            if (operator2 = true ){ // if the second operator is "or"
                boolean answer = firstBoolean && secondBoolean || thirdBoolean; // this will be calculated
            } else if (operator2 = false){  // if the second operator is "and",
                boolean answer = firstBoolean && secondBoolean && thirdBoolean;}}   // this will be calculated
        
        if (bEntry = answer){   // if the user input equals the actual value
            System.out.println("Correct");  // this will be printed
        }else {System.out.println("Incorrect, try again");} // if it does not, this will be printed
          

    }
}    