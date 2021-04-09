import java.util.Scanner;
public class ProductionWorker extends Employee 
{
    private int shift;
    private double hourlyPayRate;

    public ProductionWorker()
    {
        shift = 1;
        hourlyPayRate = 0.0;
    }

    public ProductionWorker(String empName, String empNumber,
           String hiredDate, double payRateByHour, int shiftTime) 
    {
        super(empName, empNumber, hiredDate);
        hourlyPayRate = payRateByHour;
        shift = shiftTime;
    }
    public void setHourlyPayRate(int payRateByHour)
    {
        hourlyPayRate = payRateByHour;
    }
    public void setShift(int shiftTime)
    {
        shift = shiftTime;
    }
    public int getHourlyPayRate()
    {
        return hourlyPayRate;
    }
    public int getShift()
    {
        return shift;
    }
    public String toString()
    {
        if(shift == 1)
        {
            System.out.println("Shift: Day");
        }
        else if(shift == 2)
        {
            System.out.println("Shift: Night");
        }
        else
        {
            System.out.println("Shift: INVALID SHIFT NUMBER");
        }
        System.out.printf("Hourly Pay Rate: $%.2f\n", hourlyPayRate);
        return "";
    }

}