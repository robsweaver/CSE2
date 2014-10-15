/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0{
    
  public static void main(String arg []){
      
    int n;  
      
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      System.out.println("Please enter an interger");
      return;
    }
    
    int k=4,p=6,q=7,r=8;
    
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("Again, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
     The first error in this program was the fact that the user inputted interger
     "n" was declared as an interger within an if statement. It should be initialized
     only within the main method.
     
     Secondly, the expected output says "Again", while the original program would have
     the computer write "To repeat". This wording difference is technically a logic error.
     
     Additionally, there is a logic error in the program at the first else statement. 
     It doesn't make any sense that if the user inputs something other than an interger,
     it will be forced into the interger n=4. Instead, there should be an error message 
     telling the user that they need to input an interger for the program to run correctly.
 *   Explain the error(s) that occurred here, and then fix them
 */
