// Rob Weaver
// 30 September 2014
// CSE 02 Homework 5
// Burger King Java Program

import java.util.Scanner;    // imports scanner utility

public class BurgerKing {  // creates a class named Burger King
    
    public static void main (String[] args) {   // creates main method
    
        Scanner myScanner = new Scanner (System.in);    // creates scanner called myScanner
        
        System.out.println("Enter a letter to indicate the choice of"); // prompts user for a choice of purchase
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.print("Fries (F or f): ");
        
        String fChoice = myScanner.next();  // accepts inputs that are strings
        switch (fChoice){  // switch statement which allows multiple cases
            
            // depending on the input, different cases will be run, resulting in different processes (continues through the program)
            case "B":
                System.out.println("Enter A or a for all the fixins");      // prompts user for burger options (this process repeats throughout the program)
                System.out.println("C or c for cheese");
                System.out.println("N or n for none of the above");
            
                String sChoice = myScanner.next();  // accepts next string as sChoice (second choice)
                switch (sChoice){   // creates a switch statements for multiple cases of burgers
                    
                    // depending on the input, different cases will be run with different outputs (continues for the rest of the program)
                    case "A":   
                        System.out.println("You ordered a burger with all the fixins");
                        break;  // ends each case to begin a new one
                    case "a":
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case "C":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "c":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "N":
                        System.out.println("You ordered a plain burger");
                        break;
                    case "n":
                        System.out.println("You ordered a plain burger");
                        break;
                    default:    // if none of the cases are met, this code runs and displays an error message (continues throughout)
                        System.out.println("Please enter a valid input");
                        break;
                }
            break;  // ends case "B"
            
            case "b":
                System.out.println("Enter A or a for all the fixins");
                System.out.println("C or c for cheese");
                System.out.println("N or n for none of the above");
            
                String tChoice = myScanner.next();
                switch (tChoice){
                    
                    case "A":
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case "a":
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case "C":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "c":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "N":
                        System.out.println("You ordered a plain burger");
                        break;
                    case "n":
                        System.out.println("You ordered a plain burger");
                        break;
                    default:
                        System.out.println("Please enter a valid input");
                        break;
                }
            break;  // ends case "b"
            
            case "S":   // creates case "S" for soda
                System.out.println("Do you want pepsi (P or p), Sprite (S or s),");
                System.out.println("Coke (C or C) or Mountain Dew (M or m)");
                
                String foChoice = myScanner.next();
                switch (foChoice){
                    
                    case "P":
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "p":
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "S":
                        System.out.println("You ordered a Sprite");
                        break;
                    case "s":
                        System.out.println("You ordered a Sprite");
                        break;
                    case "C":
                        System.out.println("You ordered a Coke");
                        break;
                    case "c":
                        System.out.println("You ordered a Coke");
                        break;
                    case "M":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    case "m":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    default:
                        System.out.println("Please enter a valid input");
                        break;
                }
            break;  // ends case "S"
            
            case "s":   // creates case "s" for soda
                System.out.println("Do you want pepsi (P or p), Sprite (S or s),");
                System.out.println("Coke (C or C) or Mountain Dew (M or m)");
                
                String fiChoice = myScanner.next();
                switch (fiChoice){
                    
                    case "P":
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "p":
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "S":
                        System.out.println("You ordered a Sprite");
                        break;
                    case "s":
                        System.out.println("You ordered a Sprite");
                        break;
                    case "C":
                        System.out.println("You ordered a Coke");
                        break;
                    case "c":
                        System.out.println("You ordered a Coke");
                        break;
                    case "M":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    case "m":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    default:
                        System.out.println("Please enter a valid input");
                        break;
                }
            break;  // ends case "s"
            
            case "F":   // creates case "F" for fries
                System.out.println("What size fries do you want? Enter L,l,S, or s: ");
                
                String siChoice = myScanner.next();
                switch (siChoice){
                    
                    case "L":
                        System.out.println("You ordered large fries");
                        break;
                    case "l":
                        System.out.println("You ordered large fries");
                        break;
                    case "S":
                        System.out.println("You ordered small fries");
                        break;
                    case "s":
                        System.out.println("You ordered small fries");
                        break;
                    default:
                        System.out.println("Please enter a valid input");
                        break;
                }
            break;  // ends case "F"
            
            case "f":   // creates case "f" for fries
                System.out.println("What size fries do you want? Enter L,l,S, or s: ");
                
                String seChoice = myScanner.next();
                switch (seChoice){
                    
                    case "L":
                        System.out.println("You ordered large fries");
                        break;
                    case "l":
                        System.out.println("You ordered large fries");
                        break;
                    case "S":
                        System.out.println("You ordered small fries");
                        break;
                    case "s":
                        System.out.println("You ordered small fries");
                        break;
                    default:
                        System.out.println("Please enter a valid input");
                        break;
                }
            break;  // ends case "f"
            
            default:
                System.out.println("Please enter a valid input");   // error message if none of the cases are met
        }
    }
}    