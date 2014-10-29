// Rob Weaver
// 15 October 2014
// CSE 02 Lab 7
// Loop The Loop Java Program

import java.util.Scanner;   // imports scanner utility

public class LoopTheLoop{
    
    public static void main(String arg []){
        
    // declare variables
        int nStars = 0;
        String star = "*"; 
        int starsOnLine = 0;
     
        while (starsOnLine <10){
            System.out.println(nStars);
            starsOnLine+=1;
    
            while (nStars<10){
                System.out.print(star);
                nStars+=1;
               
                
                
        
            }
        
        } 
        
        
    }
}