// Name: Karmaly, Shayan
// Project: #2
// Due: 14 October 2019
// Course: cs-1280-01-f19
// Description: A number guessing game where a secret number is generated between 1-100 and the user has to guess the correct number. 
#include <iostream>
#include <iomanip>
#include <cstdlib>
using namespace std;
int main(){
    cout<< "S. Karmaly's Number Guessing Game"<<endl;
    cout<< "                                 "<<endl;
    cout<< "A secret number between 1-100 has been generated."<<endl;
    
    srand(time(NULL));
    int secretNumber = rand()%100 + 1;
    int userGuess = 0;
    int guessCounter = 0;
    cout<<"                              "<<endl;
    cout<< "Please enter the first guess? ";
   
    cin>> userGuess;
    guessCounter++;
         
        do {
        if (userGuess > secretNumber){
        cout<< "Too high, try again."<<endl;
        cout<<"Please enter another guess? ";
        cin>> userGuess;
        guessCounter++;

   }
        else if (userGuess < secretNumber) {
            cout<< "Too low, try again."<<endl;
            cout<<"Please enter another guess? ";
            cin>> userGuess;
            guessCounter++;
        }
}
 while (secretNumber != userGuess); 
 cout<< "Correct in "<< guessCounter<<" guesses."<<endl;
}
