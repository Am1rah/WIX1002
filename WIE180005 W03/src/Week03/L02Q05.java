package Week03;

import java.util.Random;

public class L02Q05 {
    public static void main(String[] args) {
        
        Random gen = new Random();
        
        System.out.println("Take a number.");
        
        int x = gen.nextInt(10001);
        
        System.out.println("The number you have chosen is " + x);
        
        String y = Integer.toString(x);
        
        System.out.println(y);
    }
}
