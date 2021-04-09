//Shayan Karmaly
// CS 1400, section 02
//Project 3 Slot Machine Simulator
// February 18 2020

import java.util.Scanner;
import java.util.Random;

public class SlotMachineSimulator 
{
    public static void main (final String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();

        
        char playAgain = 'Y';
        int slot1, slot2, slot3;
        double amountWon = 0;
        double totalBet = 0;
        double amountBet = 0;
        int index;
        String word = "";
        String word1 = "";
        String word2 = "";
        String word3 = "";

        System.out.println("Welcome to the Slot Machine Simulator.");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.print("Enter the amount you would like to bet: $");
        amountBet = kb.nextDouble();

        do
        {
            for(int countWord = 1; countWord <=3; countWord++)
        {
                index = rand.nextInt(6);
                
            if(index == 0)
            {
                word = "Cherries";
            }
            else if (index == 1)
            {
                word = "Oranges";

            }
            else if (index == 2)
            {
                word = "Plums";
            }
            else if (index == 3)
            {
                word = "Bells";
            }
            else if (index == 4)
            {
                word = "Melons";
            }
            else if (index == 5)
            {
                word = "Bars";
            }
            
            if(countWord ==1)
            {
                word1 = word;
            }
            else if (countWord == 2)
            {
                word2 = word;
            }
            else if (countWord == 3)
            {
                word3 = word;
            }
        
        }
        System.out.println("Would you like to play again?");
        System.out.print("Enter Y for yes or N for no: ");
        playAgain = kb.next().charAt(0);
    }
    while(playAgain == 'Y');
        
        System.out.print(word);
        if(word1 != word2 && word1 != word3 && word2 != word3)
        {
            System.out.println("Sorry, none match...");
            System.out.print("You win $0.00");
        }
        else if(word1 == word2 && word1 != word3 || word1 == word3 && word1 != word2  || word2 == word3 && word2 != word1 )
        {
            System.out.println("Great ! Two matches.");
            System.out.println("That doubles your bet !");
            System.out.printf("You win " + (amountBet *2));
        }
        else
        {
            System.out.println("Wow! All three match!");
            System.out.println("That triples your bet!");
            System.out.print("You win " + (amountBet*3));
        }
        
        System.out.print("-" + word1 + "--" + word2 + "--" + word3 + "-");
    
        System.exit(0);
        }
    }

    
    
         
     

    
        









/*
        switch(rand.nextInt(6))
        {
            case 0:
                spin = "Cherries";
                System.out.println("Cherries");
                break;
                case 1:
                spin = "Oranges";
                System.out.println("Oranges");
                break;
       
             case 2:
                spin = "Plums";
                System.out.println("Plums");
                break;
       
             case 3:
                spin = "Bells";
                System.out.println("Bells");
                break;
       
             case 4:
                spin = "Melons";
                System.out.println("Melons");
                break;
       
             case 5:
                spin = "Bars";
                System.out.println("Bars");
                break;
       
             default:
                System.out.println("ERROR ERROR ERROR");
                break;
             }
        }


    }
}
*/