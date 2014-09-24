// Rob Weaver
// 10 September 2014
// CSE lab03
// Income Tax Java Progra

import java.util.Scanner;

//  define a class
    public class IncomeTax {
    
//      choose a main method
        public static void main(String[] args) {
            
            int num;
            
//          scanner
            Scanner keyboard = new Scanner (System.in);
            
//          Prompt the user for number of thousands
            System.out.println ("Enter an int giving the number of thousands: ");
            num = keyboard.nextInt();   // accept value
            
            if (keyboard.hasNextInt()){
                boolean num = keyboard.hasNextInt();
            
                if (78>=num){
                double tax = 14.0;
            
                }else if (60>=num){
                double tax = 12.0;
                
                }else if (40>=num){
                double tax = 7.0;
                
                }else if (20>=num){
                double tax = 5.0;}
                
                else {
                double tax = 14.0;}
            
                System.out.print("The tax is" + tax);
                
                double numThous;
                double taxPercent;
                double totalTax;
                
                numThous = num*1000;
                taxPercent = tax/100;
                totalTax = taxPercent*numThous;
                
                System.out.println "The tax rate on $"+numThous+" is "+taxPercent+"% and the tax is "+totalTax);
            
            
            }else{System.out.println("Please enter an interger");}
        }   
    }
            