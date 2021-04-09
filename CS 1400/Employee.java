import java.util.Scanner;
public class Employee
{
    private String name;
    private String employeeNumber; 
    private String hireDate;

    //private wrapper method validates employee number
    private Boolean validEmployeeNumber(String empNumber)
    {
        String number;
        char ch;
        int value;
        int ind = empNumber.indexOf("-");
        if(ind == -1)
        {
            return false;
        }
        number = empNumber.substring(0,index);
        ch = empNumber.substring(ind +1).charAt(0);

        for(int i =0; i<number.length(); i++)
        {
            val = num.charAt(i)-'0';
            if(val<0|| val>9)
            {
                return false;
            }
        }
        if(ch<'A' || ch> 'Z')
        {
            return false;
        }
        return true;
    }

    public Employee()
    {
        name = "";
        employeeNumber = "";
        hireDate = "";
    }
    public Employee(String passedName, String passedEmployeeNumber, String passedHireDate)
    {
        name = passedName;
        employeeNumber = passedEmployeeNumber;
        hireDate = passedHireDate;
    }
    public void setName(String passedName)
    {
        name = passedName;
    }
    public void setEmployeeNumber(String passedEmployeeNumber)
    {
        employeeNumber = passedEmployeeNumber;
    }
    public void setHireDate(String passedHireDate)
    {
        hireDate = passedHireDate; 
    }
    public String getName()
    {
        return name;
    }
    public String getEmployeeNumber()
    {
        return employeeNumber;
    }
    public String getHireDate()
    {
        return hireDate;
    }
    public String toString()
    {
        System.out.println("Name: " + name);
        System.out.println("Employee Number: "+ employeeNumber);
        System.out.println("Hire Date: " + hireDate);
        return "";
        
        
    }

    
}
