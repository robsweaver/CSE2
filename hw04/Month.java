// Rob Weaver
// 24 September 2014
// CSE 02 hw04
// Month Java Program

import java.util.Scanner;    // imports scanner utility

    public class Month{ // defines the class

        public static void main(String[] args) {    //creates main method
        
            Scanner myScanner = new Scanner (System.in);    // creates a scanner called myScanner
            
            System.out.print("Please enter an interger for the month (1-12): ");    // prompts user for a month as an interger
            boolean bMonth = myScanner.hasNextInt(); 
             
            if (bMonth==true){  // if the boolean is true (the next user input is an interger), the following processes take place
            
                int month = myScanner.nextInt();  // saves user input as an interger
                
                if (month==1){  // if it is January, 
                System.out.println("There are 31 days in January");}    // prints number of days
                
                else if (month==2){ //  if February,
                
                    System.out.print("Enter and int giving the year: ");    // prompts user for the year
                    boolean bYear = myScanner.hasNextInt();
                    
                    if (bYear==true){
                    
                        int year = myScanner.nextInt(); // accepts and saves the year
                    
                        if (year%4==0){ // checks if the year has a remainder of zero. if it does,
                        System.out.println("In that year, February has 29 days");}  // this code is printed
                    
                        else {  // if not,
                        System.out.println("In that year, February has 28 days");}} // this code is printed
                    
                    else {System.out.println("Please enter a valid year");}}
                
                else if (month==3){ // follows the same pattern as month 1
                    System.out.println("There are 31 days in March");}
                
                else if (month==4){
                    System.out.println("There are 30 days in April");}
                    
                else if (month==5){
                    System.out.println("There are 31 days in May");}
                    
                else if (month==6){
                    System.out.println("There are 30 days in June");}
            
                else if (month==7){
                    System.out.println("There are 30 days in July");}
            
                else if (month==8){
                    System.out.println("There are 31 days in August");}
                    
                else if (month==9){
                    System.out.println("There are 30 days in September");}
                    
                else if (month==10){
                    System.out.println("There are 31 days in October");}
                
                else if (month==11){
                    System.out.println("There are 30 days in November");}
                    
                else if (month==12){
                    System.out.println("There are 31 days in December");}
                
                else{   // if none of these intergers are entered,
                    System.out.println("Please enter an interger between 1 and 12");}   //  this error message will be displayed
                
            }
            else {  // if the boolean is not true, 
                System.out.println("Please enter an interger");    // this error message is displayed
                return;} // ends program
            
            
        }   // ends main method
    }   // ends class
    