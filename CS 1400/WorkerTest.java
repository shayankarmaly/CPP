import java.util.Scanner;
public class WorkerTest
{
    public static void main(String[] args)
    {
        ProductionWorker employee1 = new ProductionWorker("John Smith", "123-A", "11-15-2005", 23.50, 1);
        ProductionWorker employee2 = new ProductionWorker("Joan Jones", "222-L", "12-12-2018", 18.50, 2);
        ProductionWorker employee3 = new ProductionWorker("Tony Gaddis", "13b", "1-23-2006", 19.50, 3);
        
        System.out.println("Here's the first production worker.");
        System.out.println(employee1);
        System.out.println();

        System.out.println("Here's the second production worker.");
        System.out.println(employee2);
        System.out.println();

        System.out.println("Here's the third production worker.");
        System.out.println(employee3);
        System.out.println();

    }
}