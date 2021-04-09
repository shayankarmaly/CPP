// Karmaly, Shayan
// Project 3
// Due: Wednesday October 23, 2019
// Course: cs-1280-01-f19
// Description: Period table program
#include <iostream>
#include <fstream>
#include <iomanip>
#include <string>
using namespace std;
int main()
{
    const int MAX_ELEMENTS = 130;
    int atomicNo [MAX_ELEMENTS];
    string symbol [MAX_ELEMENTS];
    string name [MAX_ELEMENTS];
    float mass [MAX_ELEMENTS];
    int actualElements = 0;
   
    ifstream input;
    ofstream  output;
    input.open("/user/tvnguyen7/data/periodictable.dat");

  while (input>> atomicNo[actualElements]) {
        input>> symbol[actualElements];
        input>> mass[actualElements];
        input>> name[actualElements];
        actualElements++;
    }
    input.close();


char  printTable = 'P';
char searchSymbol = 'S';
char quit ='Q';
char select= ' ';
 cout<<"Periodic Table v1 by S. Karmaly"<<endl;
 cout<<"                               "<<endl;
 cout<<actualElements<<" elements"<<endl;
 cout<<"                               "<<endl;
 cout<<"P - Print table"<<endl;
 cout<<"S - Search symbol"<<endl;
 cout<<"Q - Quit"<<endl;
 cout<<"                  "<<endl;
 cout<<"Select? ";
cin>> select;
string search;


if  (select == printTable){
cout<< "Enter the output file name? ";
string fileName;
cin>> fileName;
ofstream file;
file.open(fileName);
 
file<<"Periodic Table (118)"<<endl;
file<<"                                     "<<endl;
file<<"ANo. Name                 Abr    Mass"<<endl;
file<<"---- -------------------- --- -------"<<endl;
for (int i = 0; i < actualElements; i++){
cout<<atomicNo[i];
cout<<"    "<<name[i];
cout<<"                         "<<symbol[i];
cout<<"                              "<<mass[i]<<endl;
}
 double sum = 0;
    for (int i=0; i<actualElements; i++){
        sum +=mass[i];
    }
cout<<"The average mass is:           "; 
cout<<setprecision(2)<<fixed<<sum/actualElements<<endl;
} 




 if (select == searchSymbol){
cout<< "Enter the symbol to search ";
cin>>search;
bool found = false;
int index = 0;
while (!found && index < actualElements){
if (search == symbol[index]){
found = true;
cout<< atomicNo[index]<<"  "<<name[index]<<"                         "<<symbol[index]<<"   "<<mass[index]<<endl;
 
index++;
} 
 if (search != symbol[index]) {
cout<<"Symbol not found."<<endl;
}
}

 if (select == quit){
return 0;
}
}

}

