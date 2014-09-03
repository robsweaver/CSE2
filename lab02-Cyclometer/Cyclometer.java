//Rob Weaver
//9 September 2014
//CSE2 Wednesday Lab
//Cyclometer Lab Java Program

//  define a class
    public class Cyclometer {
    
//      add a main method
        public static void main(String[] args) {

//          input data
//          time of trips 1-4 measured in seconds
            int secsTrip1=480;
            int secsTrip2=3220;
            int countsTrip1=1561;
            int countsTrip2=9037;
            
//          variables for constants
            double wheelDiameter=27.0, //  bicycle wheel diameter
            PI=3.14159, //  value of pi
            feetPerMile=5280, //    number of feet in a mile
            inchesPerFoot=12, //    number of inches in a foot
            secondsPerMinute=60; // number of seconds in a minute
            double distanceTrip1, distanceTrip2, totalDistance; 
            
//          seconds to minutes conversion and rotation count for trip 1 
            System.out.println("Trip 1 took " +
                (secsTrip1/secondsPerMinute) + " minutes and had "+
                countsTrip1 + " counts.");
            
//          seconds to minutes conversion and rotation count for trip 2
            System.out.println("Trip 2 took " +
                (secsTrip2/secondsPerMinute) + " minutes and had " +
                countsTrip2 + " counts.");
            
//          unit conversions and computation (rotations*diameter*pi=distance)
            distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; // answer in miles
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // answer in miles
            totalDistance=distanceTrip1+distanceTrip2; // total distance
            
//          print output data
            System.out.println("Trip 1 was " +distanceTrip1+ " miles.");
            System.out.println("Trip 2 was " +distanceTrip2+ " miles.");
            System.out.println("The total distance was " + totalDistance + " miles.");
            
        }   // end main mehod
    }   //end class