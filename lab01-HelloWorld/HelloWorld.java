import java.util.Scanner;

public class HelloWorld{
  
  public static void main (String[] args){
    
    Scanner myScanner = new Scanner (System.in);
    
    System.out.println("Frat guy: hows the ratio, bruh?");
    System.out.print("Guys: ");
    int nGuys = myScanner.nextInt();
    System.out.print("Girls: ");
    int nGirls = myScanner.nextInt();
    
    double ratio = nGirls/nGuys;
    
    if (ratio >= 2)
{
  System.out.println("Come on in, fellas");
}    else {System.out.println("Sorry, we're full");}
    
    
  }
}