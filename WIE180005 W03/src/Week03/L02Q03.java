package Week03;
import java.util.Random;

public class L02Q03 {
    public static void main(String[] args) {
        
        Random num = new Random();
        
        int max = 60;
        
        int min = 10;
        
        System.out.println("Computer chooses 3 integers, x, y, and z.");
        
        int x = num.nextInt((max- min)+1);
        
        System.out.println("The first integer is " + x);
        
        int y = num.nextInt((max- min)+1);
        
        System.out.println("The second integer is " + y);
        
        int z = num.nextInt((max- min)+1);
        
        System.out.println("The last integer is " + z);
        
        int a = x + y + z;
        
        System.out.println("The sum of those three numbers are " + a);
        
        System.out.print("The average of these three equals ");
        
        float b = (float) a/3;
        
        System.out.printf("%5.2f", b);
    }
}
