// Rob Weaver
// 28 October 2014
// CSE 02 Homework 8
// Homework Java Program

import java.util.Scanner;   // imports scanner utility

public class HW8{  // creates class named Root
    
    public static void main(String arg []){ // creates main method for the program
 
        char input;	// creates variable as a character named input
	    Scanner myScanner = new Scanner(System.in);	// creates scanner called myScanner
	    
	    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");	// prompts for user input
	    input=getInput(myScanner,"Cc");	// calls for a method with certain perameters
	    
	    System.out.println("You entered '"+input+"'");	// declaration of answer
	    
	    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");	// Prompts user for input under a method with different parameters
	    input=getInput(myScanner,"yYnN",5); //give up after 5 attempts
	    if(input!=' '){	// if the user does not enter nothing, 
	        System.out.println("You entered '"+input+"'");	// their input will be printed
	    }
	    input=getInput(myScanner,"Choose a digit.","0123456789");	// prompts user for input under a method with different parameters
	    System.out.println("You entered '"+input+"'");	// declaration of answer
	    
    }
    
    public static char getInput(Scanner myScanner, String listOfChars){	// creates method called getInput with the specified parameters
    	String sInput = myScanner.next();	// saves user input as a string
    	char firstChar = sInput.charAt(0);	// isolates the first character of the string
    	boolean success = false;	// initially, the user input has not succesffully been entered

    	
    	// this repeats an error message until we get an input of length 1
    	while (sInput.length() != 1){
    		System.out.println("Please enter only one character - try again");
    		sInput = myScanner.next();	// re-prompts user
    	}
    	
    	while(success==false){	// loop that repeats until the scanner finds a correct input
    		firstChar = sInput.charAt(0);	// isolates first character again
    		//int i = 0;
    		//while (firstChar == listOfChars.charAt(i)){
    		//	i+=1;
    		success=false;
    		for (int i=0;i<listOfChars.length();i++){	// loop to check each character of listofChars
    			// iterate through each character in listofChars
    			if (firstChar==listOfChars.charAt(i)){	// if the user inputted character matches one of the chars int the list,
    				success=true;	// boolean returns true
    			
    			}
    		}
    		if(success==false){	// if not,
    			System.out.println("The string you entered wasnt in our list of chars");	// error message
    			System.out.println("try again");
    			sInput = myScanner.next();	// re-prompt
    		}else{	// if so,
    			success=true;	// boolean returns true
    			
       		}
    	
    	}
    	
    	return firstChar;	// ends program
    	
    	
    }
    
    public static char getInput(Scanner myScanner, String listOfChars, int failuresAllowed){
    	String sInput = myScanner.next();
    	char firstChar = sInput.charAt(0);
    	boolean success = false;
    	int nFailures = 0;

    	
    	// this repeats an error message until we get an input of length 1
    	while (sInput.length() != 1){
    		System.out.println("Please enter only one character - try again");
    		sInput = myScanner.next();
    	}
    	
    	while(success==false){
    		firstChar = sInput.charAt(0);
    		//int i = 0;
    		//while (firstChar == listOfChars.charAt(i)){
    		//	i+=1;
    		success=false;
    		for (int i=0;i<listOfChars.length();i++){
    			//iterate through each character in listofChars
    			if (firstChar==listOfChars.charAt(i)){
    				success=true;
    			
    			}
    		}
    		if(success==false){
    			System.out.println("The string you entered wasnt in our list of chars");
    			System.out.println("try again");
    			sInput = myScanner.next();
    		}else{
    			success=true;
    			
       		}nFailures+=1;
    	
    	}
    	
    	return firstChar;
    	
    	
    	
    
    }
    public static char getInput(Scanner myScanner, String prompt, String listOfChars){
    	String sInput = myScanner.next();
    	char firstChar = sInput.charAt(0);
    	boolean success = false;

    	
    	// this repeats an error message until we get an input of length 1
    	while (sInput.length() != 1){
    		System.out.println("Please enter only one character - try again");
    		sInput = myScanner.next();
    	}
    	
    	while(success==false){
    		firstChar = sInput.charAt(0);
    		//int i = 0;
    		//while (firstChar == listOfChars.charAt(i)){
    		//	i+=1;
    		success=false;
    		for (int i=0;i<listOfChars.length();i++){
    			//iterate through each character in listofChars
    			if (firstChar==listOfChars.charAt(i)){
    				success=true;
    			
    			}
    		}
    		if(success==false){
    			System.out.println("The string you entered wasnt in our list of chars");
    			System.out.println("try again");
    			sInput = myScanner.next();
    		}else{
    			success=true;
    			
       		}
    	
    	}
    	
    	return firstChar;
    	
    	
    }
    
    
}    
    