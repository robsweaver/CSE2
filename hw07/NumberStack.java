// Rob Weaver
// 14 October 2014
// CSE 02 Homework 7
// Number Stack Java Program

import java.util.Scanner;   // imports scanner utility

public class NumberStack{  // creates class named Root
    
    public static void main(String arg []){ // creates main method for the program
    
        Scanner myScanner = new Scanner (System.in);    // creates scanner called myScanner
        System.out.print("Please enter a number between 1 and 9: ");    // prompts user
        int myNumber = myScanner.nextInt(); // saves input as an int
        
        int num =1; // declaring variable that will steadily increase
        int spaces = myNumber-1;    // declaring variable that allows spacing
        
        if (myNumber>0 && myNumber<10){ // if the value is in the correct limit, 
            
            System.out.println("Using for loops:"); // intro text
        
            for (int counter3 = 0; counter3 <myNumber; counter3++){ // loops following code until counter reaches myNumber

                // loops lines to create rows
                for (int counter =  0; counter < num+1; counter++){ 
                    System.out.println();
                
                    // loops the spaces before a number to be one less than the user inputted number
                    for (int counter4=0; counter4 < spaces; counter4++ ){
                        System.out.print(" ");
                    }
                        // loops a single digit until counter 2 is greater than 2*num-1
                    for (int counter2 = 0; counter2 < (2*num)-1 ; counter2++){
                        
                        if (counter == num){    // if the number of rows equals the num, replaces the num with a "-"
                            System.out.print("-");
                        }
                        else {
                            System.out.print(num);
                        }
                    }
                }
        
            num+=1; // increases by 1 each loop
            spaces-=1;  // decreased by 1 each loop
    
            }
            System.out.println();
            System.out.println("Using while loops:");
            
            int num1=1;
            int spaces1 = myNumber-1;
            int counter8 = 0;
            int counter7=0;
                
            while (counter8<myNumber){
                int counter5=0;
                counter8++;
                int counter6=0;
                
                
                while (counter7<num1+1){
            
               
                    
                    
                    
                    while (counter6<spaces1){
                        System.out.print(" ");
                        counter6++;
                    }
                    while (counter5<(2*num1)-1){
                        counter5++;
                        if (counter7 == num1){
                            System.out.print("-");
                        }
                            
                        else {
                            System.out.print(num1);
                        }

                    }
                    
                    
                   
                    counter7++;
                }    
                
                
                
                num1++;
                spaces1--;
                System.out.println();
                counter7=0;
            }
            
            
            
            
            
        }
        else{
            System.out.println("Please enter an int between 1 and 9");
        }
    }
}