// Shayan Karmaly
// CS1400, section 02
// Project 4 - Display diamonds
// February 26th, 2020
import java.util.Scanner;

public class Diamond{

public static void main(String [] args)
{ 
    int size =-1;
    String choice;
    Scanner scnr=new Scanner(System.in);

    while(size ==-1)
    {
        System.out.print("enter diamond size " + "(" +"\"short\"" +"," + "\"average\"" +" or " + "\"tall\"" +")" + ": ");
        choice = scnr.nextLine();
        size =checkSize(choice);
    }

    System.out.print("enter pattern character: ");
    char ch = scnr.next().charAt(0);
    Diamond.displayDiamond(size,ch);
    Diamond.displayHollowDiamond(size,ch);
}

public static int checkSize(String size){

if(size.equals("short"))
{
    return 6;
}

if(size.equals("average"))
{
    return 12;
}

if(size.equals("tall"))
{
    return 24;
}
    return -1;
}

public static void displayHollowDiamond(int size,char ch){

int i, j, space, k = 0;

System.out.println();
System.out.println();
System.out.println();

for (i = 1; i <= size; i++) 
{
    for (j = 1; j <= size - i; j++) 
    {
        System.out.print(" ");
    }

    while (k != (2 * i - 1)) 
    {
        if (k == 0 || k == 2 * i - 2)
            System.out.print(ch);
        else
            System.out.print(" ");
            k++;
    }   
    k = 0;
    System.out.println();
}
size--;

for (i = size; i >= 1; i--) 
{
    for (j = 0; j <= size - i; j++) 
    {
        System.out.print(" ");
    }
    k = 0;

    while (k != (2 * i - 1)) 
    {
        if (k == 0 || k == 2 * i - 2)
            System.out.print(ch);
        else
            System.out.print(" ");
            k++;
    }
    System.out.println();
}
}

public static void displayDiamond(int size,char ch)
{
    int i=1;
    int j;

    while(i<=size)
    {
        j=1;
        while(j++<=size-i)
        {
            System.out.print(" ");
        }
        j=1;
        while(j++<=i*2-1)
        {
            System.out.print(ch);
        }
            System.out.println();
            i++;
        }
        i=size-1;

    while(i>0)
    {
        j=1;
        while(j++<=size-i)
        {
            System.out.print(" ");
        }   
        j=1;
        while(j++<=i*2-1)
        {
            System.out.print(ch);
        }
        System.out.println();
        i--;
        }

}
}