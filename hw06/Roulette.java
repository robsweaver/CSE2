// Rob Weaver
// 30 September 2014
// CSE 02 Homework 5
// Roulette Java Program

import java.util.Random;    // imports random number generator
import java.util.Scanner;   // imports scanner utility

public class Roulette{  // creates class called Roulette
    
    public static void main(String[] args){ // creates main method
    
        Scanner myScanner = new Scanner (System.in);
        int myNumber;
        System.out.print("Please enter your number: ");
        myNumber = myScanner.nextInt();
        
        Random roulette = new Random();
        
        int currentWinnings = 100;
        int number;
        int profit;
        int nProfits = 0;
        int nLosses = 0;
        int tWinnings = 0;
        
        for (int counter2=0;counter2<1000;counter2++){
                    
        currentWinnings = 100;
        
// this loop represents spinning the roulette wheel
            for (int counter =  0; counter < 100; counter++){   // guildelines for the random number: must be an interval of 1 and print 1 number
                        currentWinnings-=1;
                        number = roulette.nextInt(39);  // allows numbers up to 38
                     //   System.out.print(number +" ");    // prints the number
                    
                if (number == myNumber){
                    currentWinnings+=38;
            
                }
            }
            //one session is over
            
            
            profit = currentWinnings-100;   //caclulates if we have more money than we started with
            tWinnings = profit + tWinnings; //increases total winnings by each rounds profit every time
            
//            System.out.println("your profit from this round was "+profit);
            
            // if the profit is greater than 0, increase number of profits by one
            if (profit>0){   
                nProfits+=1;
            // if the profit is less than 0, increase the number of losses by one
            }else if (profit<=0){
                nLosses+=1;   
            
                
                
            }    
        }    
        System.out.println("Your total winnings are: $"+tWinnings);
        System.out.println("You profitted "+nProfits+" times!");
        System.out.println("You lost everything "+nLosses+" times!");
    }
}   