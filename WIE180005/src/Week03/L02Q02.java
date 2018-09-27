package Week03;

import java.util.Scanner;

public class L02Q02 {
    
    public static void main(String[] args) {
        
        Scanner calc = new Scanner(System.in);
            
        System.out.println("Calcuting your monthly payment.");

        System.out.println("What is the price of your car (in RM)?");

        float p = calc.nextFloat();

        System.out.println("What is the down payment(in RM)?");

        float d = calc.nextFloat();

        System.out.println("What is the interest rate (in %)?");

        float r = calc.nextFloat();

        System.out.println("What is the loan duration within the year?");

        float y = calc.nextFloat();

        float m;
        
        m = (float) (p - d)*(1 + r*y/100)/(y*12);

        System.out.println("Your monthly payment should be RM");

        System.out.printf("%20.2f", m); 
    }
}
