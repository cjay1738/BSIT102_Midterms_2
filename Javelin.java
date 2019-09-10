import java.util.Scanner;
import java.util.Random;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Javelin {

    public static void main(String []args)throws Exception {
    	
    	Scanner sc = new Scanner (System.in);
    	DecimalFormat df = new DecimalFormat(".##");
    	String p1,p2,p3,p4;
    	
    	Random rn = new Random();
    	int rangeMax = 150;
    	int rangeMin = 50;
    	int initial = 20;
    	
    	double randomValue1 = rangeMin + (rangeMax - rangeMin) * rn.nextDouble();
    	double randomValue2 = rangeMin + (rangeMax - rangeMin) * rn.nextDouble();
    	double randomValue3 = rangeMin + (rangeMax - rangeMin) * rn.nextDouble();
    	double randomValue4 = rangeMin + (rangeMax - rangeMin) * rn.nextDouble();
    	
    	System.out.print("Player 1: ");
    	p1 = sc.nextLine();
    	System.out.print("Player 2: ");
    	p2 = sc.nextLine();
    	System.out.print("Player 3: ");
    	p3 = sc.nextLine();
    	System.out.print("Player 4: ");
    	p4 = sc.nextLine();
    	
    	System.out.println("Player 1: " + p1 + " has thrown at " + df.format(randomValue1) + " meters. ");
    	System.out.println("Player 2: " + p2 + " has thrown at " + df.format(randomValue2) + " meters. ");
    	System.out.println("Player 3: " + p3 + " has thrown at " + df.format(randomValue3) + " meters. ");
    	System.out.println("Player 4: " + p4 + " has thrown at " + df.format(randomValue4) + " meters. ");
    	
    	
    
    }
    
    
}