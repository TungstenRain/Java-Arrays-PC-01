package ch07pc01;

/**
 *
 * @author Frank
 * date 11/12/2017
 */
public class RainFall {
    //fields
    private double[] rainfall;
    
    //construcotr
    public RainFall()
    {
        rainfall = new double[12];
    }
    
    //methods
    public void setRainfall(int i, double rain)
    {
        rainfall[i] = rain;
    }
    
    public double getTotalRainfall()
    {
        double total = 0.0;
        int i;
        
        for (i = 0; i < rainfall.length; i++)
        {
            total += rainfall[i];
        }
        
        return total;
    }
    
    public double getAverageRainfall()
    {
        double average;
        
        average = getTotalRainfall() / rainfall.length;
        
        return average;
    }
    
    public String getMonthWithMostRainfall()
    {
        String month;
        int i, max = 0;
        double maxValue = 0.0;
        
        for (i = 0; i < rainfall.length; i++)
        {
            if (rainfall[i] > maxValue)
            {
                max = i;
                maxValue = rainfall[i];
            }
            
        }
        
        month = getMonth(max);
        return month;
    }
    
    public String getMonthWithLeastRainfall()
    {
        String month;
        int i, min = 0;
        double minValue = rainfall[0];
        
        for (i = 0; i < rainfall.length; i++)
        {
            if (rainfall[i] < minValue)
            {
                min = i;
                minValue = rainfall[i];
            }
        }
        
        month = getMonth(min);
        return month;
    }
    
    public String getMonth(int month)
    {
        String monthName;
        
        switch (month)
        {
            case 0:
                monthName = "January";
                break;
            case 1:
                monthName = "February";
                break;
            case 2:
                monthName = "March";
                break;
            case 3:
                monthName = "April";
                break;
            case 4:
                monthName = "May";
                break;
            case 5:
                monthName = "June";
                break;
            case 6:
                monthName = "July";
                break;
            case 7:
                monthName = "August";
                break;
            case 8:
                monthName = "September";
                break;
            case 9:
                monthName = "October";
                break;
            case 10:
                monthName = "November";
                break;
            case 11:
                monthName = "December";
                break;
            default:
                monthName = "Error";
                break;
        }
        return monthName;
    }
}
