// Rob Weaver
// 24 September 2014
// CSE hw04
// Time Padding Program

import java.util.Scanner;   // imports scanner utility

public class TimePadding{   // creates class
    
    public static void main(String[] args){ // creates a main method
        
        Scanner myScanner = new Scanner (System.in);    // creates a scanner called myScanner
        System.out.print("Enter the time in seconds: ");    // prompts the user for a number of seconds
        boolean bSeconds = myScanner.hasNextInt();  // saves entry as a boolean for error testing
        
        if (bSeconds == true){  // if the booean is true, code inside the brackets is read
            
            int seconds = myScanner.nextInt();  // saves the user entry as an interger
            if (seconds > 0){   //  if the integer is >0, the code is read straight through
                
                double minutes = seconds/60;    // declares and calculates the number of minutes
                double hours = minutes/60;  // declares and calculates the number of hours
                int intHours = (int) hours; // changes hours to an integer to use for printing
                minutes = minutes - intHours*60;    // calculates minutes left after hours are accounted for
                int intMinutes = (int) minutes; // changes minutes to an integer for printing
                seconds = seconds - (intMinutes*60) - (intHours*60*60); // calculates seconds left 
                                                                        // after minutes and hours
                String stringHours = Integer.toString(intHours);    // converts hours to a string for isolation
                
                String stringMinutes = String.format("%02d", intMinutes);   // converts minutes to a string
                                                                            // and stores 2 digits guarenteed
                String stringSeconds = String.format("%02d", seconds);  // converts seconds to a string
                                                                        // and stores 2 digits guarenteed
            
                System.out.println("The time is "+stringHours+":"+stringMinutes+":"+stringSeconds); // prints final result
            
            }else{System.out.println("Please enter an integer > 0");}   // prints error message for entry failure
        }else{System.out.println("Please enter an integer");}   // prints error message for entry failure
        
    }   // ends main method
}   // ends class