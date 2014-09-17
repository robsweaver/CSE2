// Rob Weaver
// 10 September 2014
// CSE hw03
// Bicycle Java Program

//  create a scanner
import java.util.Scanner;

//  define a class
    public class Bicycle {
    
//      create main method
        public static void main(String[] args) {
            
//          scanner
            Scanner myScanner;
            myScanner = new Scanner( System.in );
            System.out.print(
            "Enter the number of counts (an interger > 0): "); //  prompts the user for counts
            int nCounts = myScanner.nextInt();   
            System.out.print(
            "Enter the number of seconds (an interger > 0): "); // prompts the user for seconds
            int nSeconds = myScanner.nextInt();
            
//          constants and conversion factors
            int wheelDiameter=27;
            double PI=3.141596;
            int inchesPerFoot=12;
            int feetPerMile=5280;
            int secondsPerMinute=60;
            int minutesPerHour=60;
            
//          declare output terms
            double distance;
            double speed;
            double time;
            
//          computation and unit adjustments
            distance=wheelDiameter*nCounts*PI/inchesPerFoot/feetPerMile;
            speed=distance*secondsPerMinute*minutesPerHour/nSeconds;
            time=nSeconds/secondsPerMinute;

//          decimal fixes
            distance=Math.round(distance*100.0)/100.0;
            speed=Math.round(speed*100.0)/100.0;
            
//          print output
            System.out.println("The total distance traveled was "+distance+" miles and took "+time+" minutes");
            System.out.println("The average speed was "+speed+" mph");
        
        }
    }
    
