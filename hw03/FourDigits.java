// Rob Weaver
// 16 September 2014
// CSE hw03
// Root Java Program

//  import scanner to accept user input
import java.util.Scanner;

//  define a class
    public class FourDigits {
        
//      create main method
        public static void main(String[] args) {
            
            Scanner myScanner;  //create scanner
            myScanner = new Scanner( System.in );    
            
            System.out.print("Enter a number with 4 decimals:" );   //prompt user for a number with 4 decimals
            double entry = myScanner.nextDouble();  //declare 'entry' as the name of the double
        
            double doubledigits = entry*10000; //declare doubledigits variable as user input*10000
        
            int digit1=(int)((doubledigits % 10000)/1000);  //calculation to isolate the first digit
            int digit2=(int)(((entry*10000) - (digit1*1000) - ((int)entry*10000))/100); //isolate second digit
            int digit3=(int)((((entry*10000) - (digit1*1000) - (digit2*100) - ((int)entry*10000))/10)); //isolate third digit
            int digit4=(int)((((entry*10000) - (digit1*1000) - (digit2*100) - (digit3*10) - ((int)entry*10000))/1));    //isolate fourth digit
        
            System.out.println("The four digits after the decimal place are "+digit1+digit2+digit3+digit4); //print with all digits
        
        }
    }        
        