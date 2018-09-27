package Week03;

import java.util.Scanner;

public class L02Q04 {
    
    public static void main(String[] args) {
        
        Scanner calc = new Scanner(System.in);
        
        System.out.println("Please input the number of seconds.");
        
        int x = calc.nextInt();
        
        float y = (float) x/60;
        
        float z = (float) y/60;
        
        System.out.println("There are " + x + " seconds.");
                
        System.out.printf("That translates to roughly %5.2f", y);
        
        System.out.printf(" minutes and %5.2f ", z);
        
        System.out.println(" hours.");
    }
}
