package Week03;

import java.util.Random;

public class L02Q05 {
    public static void main(String[] args) {
        
        Random gen = new Random();
        
        System.out.println("Take a number.");
        
        int x = gen.nextInt(10001);
        
        System.out.println("The number you have chosen is " + x);
         
        int sum = 0;
        
        while (x > 0) {
        sum += x % 10;
        x /= 10;
}       
        System.out.println("The sum of all numerals within the number equals " + sum);
    }
}
