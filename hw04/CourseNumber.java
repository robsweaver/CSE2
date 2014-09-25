// Rob Weaver
// 24 September 2014
// CSE 02 hw04
// Course Number Java Program

import java.util.Scanner;   // imports scanner utility

public class CourseNumber{  // creates class 

    public static void main(String [] args){    // creates main method
        
        Scanner myScanner = new Scanner (System.in);    // creates a scanner called myScanner
        
        System.out.print("Enter a six digit number giving the course semester: ");      // prompts user for the course number
        boolean bNum = myScanner.hasNextInt();  // saves entry as a boolean for error testing
        
        if (bNum==true){    // if the boolean is true (entry is an int), the following code will be read
            
            int num = myScanner.nextInt();  // stores the user input as an interger
            
            if ((186510<num) && (num<201440)){  // if the entry is within range, the following code will be read
                
                int year = Math.round(num%1000000)/100; // number isolation to get the first four digits (year)
                
                int semester = num%100; // number isolation to get the last 2 digits (semester)
                
                if (semester==10){  // if the last two digits are 1 and 0, the following message will be displayed
                    System.out.println("This course was offered in the Spring semester of "+year);
                
                }else if (semester==20){    // if the last two digits are 2 and 0...
                    System.out.println("This course was offered in the Summer 1 semester of "+year);
                    
                }else if (semester==30){    // same process
                    System.out.println("This course was offered in the Summer 2 semester of "+year);
                    
                }else if (semester==40){    // same process 
                    System.out.println("This course was offered in the Fall semester of "+year);
                    
                // if the last two digits is none of the above, the following message is displayed   
                }else {System.out.println("Please enter a valid course number ("+semester+" is not a valid semester)");}
                
            // if the range of the entry is incorrect, this will be printed
            }else {System.out.println("Please enter an interger in the range between 186510 and 201440");}  
            
        }else {System.out.println("Please enter an interger");  // if the boolean is false, this will be printed
        return;}
        
    }   // ends main method
}   // ends class
