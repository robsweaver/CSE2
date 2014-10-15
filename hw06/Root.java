// Rob Weaver
// 14 October 2014
// CSE 02 Homework 6
// Root Java Program

import java.util.Scanner;   // imports scanner utility

public class Root{  // creates class named Root
    
    public static void main(String arg []){ // creates main method for the program
        
        Scanner myScanner = new Scanner (System.in);    // creates scanner to accept user input
        System.out.print("Enter the number you want to know the square root of: "); // prompt
        boolean bX = myScanner.hasNextDouble();
        if (bX == true){
            
            double x = myScanner.nextDouble();  // saves user input as a double
            double middle = 0;
            
            if (x>0){
        
                //initialize variables
                double low = 0; 
                double high = 1+x;
                
                double middleSq;
        
                while ((high-low)>(0.0000001)*(1+x)){   // runs this loop until the condition is satisfied
            
                    middle = (low+high)/2;  // middle is the average
                    middleSq = middle*middle;
//                  System.out.print(middle+" ");
                    if (middleSq>x){    // if the average squared is larger than the user input,
                        high = middle;  // the average becomes the new "high" to be calculated with next time through the loop
                    }
                    else {  // if the average squared is not larger than the user input,
                        low = middle;}   // the average becomes the new "low"
                
            
                }
                System.out.println("The square root of "+x+" is "+middle);  // prints the square root, as estimated by this program
            }
            else {
                System.out.println("Pease enter a positive interger");
            }
            
        }
        else{
            System.out.println("Please enter a double");
            
        }  // error message if the boolean returns false
            
        }   
}    