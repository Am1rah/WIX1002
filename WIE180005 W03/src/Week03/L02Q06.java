package Week03;

import java.util.Scanner;

public class L02Q06 {
    public static void main (String[] args) {
        
        Scanner calc = new Scanner(System.in);
        
        System.out.println("To find the amount of energy needed to heat water, please:");
        
        System.out.println("State the weight of water (in kg).");
        
        float m = calc.nextFloat();
        
        System.out.println("State, in degrees Celsius, the initial and final temperature of water.");
        
        float x = calc.nextFloat();
        
        float y = calc.nextFloat();
        
        float q = (float) m * (y - x) * 4184;
        
        System.out.print("The amount of energy, in Joules needed is ");
        
        System.out.printf("%10.5f", q);
    }
}
