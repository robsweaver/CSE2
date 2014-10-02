// Rob Weaver
// 29 September 2014
// CSE 02 Lab 5
// Random Games Java Program

import java.util.Random;    // imports random number generator
import java.util.Scanner;    // imports scanner utility

public class RandomGames {  // creates a class named RandomGames
    
    public static void main (String[] args) {   // creates main method
    
        Scanner myScanner = new Scanner (System.in);    // creates scanner called myScanner
        
        System.out.println("Which game would you like to play?");   // prompts user for the game type
        System.out.print("Chose R/r for Roulette, C/c for Craps, or P/p for Pick a Card: ");
        String sChoice = myScanner.next();  // accepts inputs that are strings
        
        Random roulette = new Random(); // creates a random number generator called roulette
        int number; // declares variable to be used later
        
        switch (sChoice){   // switch statement which allows multiple cases
            case "R":   // if the user inputs the string "R", the following code runs
                
                for (int counter =  1; counter <= 1; counter++){   // guildelines for the random number: must be an interval of 1 and print 1 number
                    number = roulette.nextInt(37);  // allows numbers up to 37
                    System.out.println(number +" ");    // prints the number
                
                if (number == 36){  // if the 36th number is printed (37), 
                    System.out.println("00");   // it prints 00
                }}
                break;  // ends case 
            case "r":   //preforms the same actions as case "R"

                for (int counter =  1; counter <= 1; counter++){
                    number = roulette.nextInt(37);
                    System.out.println(number +" ");
                
                if (number == 36){
                    System.out.println("00");
                }}
                break;
            case "C":   // creates case "C"
                System.out.println("Craps not implemented yet");    // prints a message to the user saying craps has not been implemented
                break;  // ends case
            case "c":   // creates case "c", which does the same as case "C"
                System.out.println("Craps not implemented yet");
                break;  // ends case
            case "P":   // creates case "P"
                System.out.println("Picking a card not implemented yet");   // prints a message to the user saying picking cards has not been implemented
                break;  // ends case
            case "p":   // creates case "p", which does the same as case "P"
                System.out.println("Picking a card not implemented yet");
                break;  // ends case
            default:    // if none of the above options are selected, this code runs by default:
                System.out.println("Please chose a valid option");  // error message
                break;  // ends case
            
        }   // ends main method
    }   // ends class
}
