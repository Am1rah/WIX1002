package Week03;
import java.util.Scanner;

public class L02Q02 {
    
    Scanner calc = new Scanner(System.in);
    
    System.out.println("Please input the following numbers.");
    
    System.out.println("What is the price of your car?");
    
    double p = calc.nextInt();
    
    System.out.println("What is the down payment?");
    
    double d = calc.nextInt();
    
    System.out.println("What is the interest rate (in %)?");
    
    double r = calc.nextInt();
    
    System.out.println("What is the loan duration within the year?");
    
    double y = calc.nextInt();
    
    double m = (double) (p - d)*(1 = r*y/100)/(y*12);
    
    System.out.println("Your monthly payment should be");
    
    System.out.printf("%9.2f", m);
}
