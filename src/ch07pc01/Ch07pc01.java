package ch07pc01;
import java.util.Scanner;
/**
 *
 * @author Frank
 * date: 11/12/2017
 * purpose: to get the total, average, most, and least amount of rainfall
 */
public class Ch07pc01 {

   public static void main(String[] args) {
        // variables
        double rain;
        int i;
        
        // create keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //instantiate RainFall class
        RainFall rainfall = new RainFall();
        
        // request user input
        for (i = 0; i < 12; i++)
        {
            System.out.print("Please enter the amount of rainfall for " + rainfall.getMonth(i) + ": ");
            rain = keyboard.nextDouble();
            
            if (rain < 0)
            {
                System.out.println("Please enter non-negative values.");
                i--;
            }
            else
            {
                rainfall.setRainfall(i, rain);
            }
        }
        
        //Report out the total, average, most, and least
        System.out.println("The total rainfall was: " + rainfall.getTotalRainfall());
        System.out.println("The average rainfall was: " + rainfall.getAverageRainfall());
        System.out.println("The month with the most rainfall was: " + rainfall.getMonthWithMostRainfall());
        System.out.println("The month with the least rainfall was: " + rainfall.getMonthWithLeastRainfall());
        
    }
    
}
