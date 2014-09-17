// Rob Weaver
// 16 September 2014
// CSE hw03
// Root Java Program

//  create a scanner to accept user input
import java.util.Scanner;

//  define a class
    public class FourDigits {
        
//      create main method
        public static void main(String[] args) {
            
        Scanner myScanner;
        myScanner = new Scanner( System.in );    
            
        System.out.print("Enter a number with 4 decimals");
        double entry = myScanner.nextDouble();
        
        double doubledigits = entry*10000;
        
        int digit1=(int)((doubledigits % 10000)/1000);
        int digit2=(int)(((entry*10000) = (digit1*1000) - ((int)entry*10000))/100); 
        int digit3=(int)((((entry*10000) - (digit1*1000) - (digit2*100) - ((int)entry*10000))/10));
        int digit4=(int)((((entry*10000) - (digit1*1000) - (digit2*100) - (digit3*10) - ((int)entry*10000))/1));
        
        System.out.println("The four digits after the decimal place are "+digit1+digit2+digit3+digit4);
        
        }
    }        
        