package Week03;

import java.util.Scanner;

public class L02Q01 {

    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);
        
        System.out.println("What is the weather?(in degrees Farenheit)");
        
        float x = calc.nextInt();
     
        float y = (float) ((x - 32)/1.8);
        
        System.out.printf("%6.2f", x);
        
        System.out.print(" degrees Farenheit is equal to"); 
        
        System.out.printf("%6.2f", y);
        
        System.out.println(" degrees Celsius.");
    }
    
}