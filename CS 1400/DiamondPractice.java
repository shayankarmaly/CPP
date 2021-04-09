import java.util.Scanner;

public class DiamondPractice
{
    public static int checkSize(String size)
    {
        Scanner scnr = new Scanner(System.in);
        int approvedSize = 0;
        size = scnr.nextLine();
        if(size == "short")
        {
            approvedSize = 6;
        }
        else if(size == "average")
        {
            approvedSize = 12;
        }
        else if(size == "tall")
        {
            approvedSize = 24;
        }
        return approvedSize;
    }
    public static void displayDiamond(int size, char ch)
    {
        int noOfColumns = 1;
        int start = 0;
        int noOfSpaces = size/2;
        
        for(int i =1; i<size;i++)
        {
            for(int j =1;j<=noOfSpaces; j++)
            {
                System.out.print(" ");
            }
            if(i<size/2+1)
            {
                start = i;
                noOfSpaces = noOfSpaces -1;
            }
            else
            {
                start = (size+1)-i;
                noOfSpaces = noOfSpaces+1;
            }
            for(int j =1; j<= noOfColumns; j++)
            {
                int middleColumn = noOfColumns/2+1;
                System.out.print(start);
                if(j<middleColumn)
                {
                    start--;
                }
                else
                {
                    start++;
                }
            }
            System.out.println();
            if(size/2+1)
            {
                noOfColumns= noOfColumns+2;
            }
            else
            {
                noOfColumns=noOfColumns-2;
            }
        }


        /*for(int i =0; i<=size; i++)
        {
            for(int j = 0; (2*i) -1; j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
        */
    }


    
    public static void main (String[] args)
    {
        String diamondSize;
        int size = 0;
        char userCh;
        Scanner scnr = new Scanner(System.in);
       
        System.out.print("enter diamond size" + "(" + "\"short, average, or tall\"" +")");
        diamondSize = scnr.nextLine();
        System.out.print("enter pattern character ");
        userCh = scnr.next().charAt(0);
        checkSize(diamondSize);
        
        displayDiamond(size,userCh);


   
        

        


        

        

    }
}