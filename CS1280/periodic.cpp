#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;
int main() {
    const int MAX_ELEMENTS = 130;
    int atomicNo [MAX_ELEMENTS];
    string symbol [MAX_ELEMENTS];
    string name [MAX_ELEMENTS];
    float mass [MAX_ELEMENTS];
    int actualElements = 0;
    ifstream input;
    input.open("/user/tvnguyen7/data/periodictable.dat");
    while (input >>atomicNo[actualElements]) {
        input >> symbol[actualElements];
        input >> name[actualElements];
        input >> mass[actualElements]; 
    }
    input.close();
    cout<<actualElements<<"elements"<<endl;
    for (int i = 0;i<actualElements;i++){
        cout <<atomicNo[i]<<"/t"<<name[i]<<endl;
    }
    double sum = 0;
    for (int i=0; i<actualElements; i++){
        sum +=mass[i];
    }
    cout<<setprecision(2)<<fixed<<sum/actualElements<<endl;
    string searchSymbol;
cout <<"enter symbol";
cin>>searchSymbol;
bool found = false;
int index = 0;
while (!found && index < actualElements){
    if (searchSymbol==symbol[index]){
        found = true;
    } else {
        index++;
    }
}

}
int index = 0;
for (int = 1; i <actualElement; i++}{
    if (mass[i] > mass[index]){
        index = i;
    }
}
cout<<name[index]<<endl;
return 0;
 
 
 
 
 if (select == printTable){



     switch (select){
case 1 :
cout<< " 
for (int i = 0; i < actualElements; i++){
cout<<"Periodic Table ("<<actualElements<<")"<<endl;
cout<<"                                     "<<endl;
cout<<"ANo. Name                 Abr    Mass"<<endl;
cout<<"---- -------------------- --- -------"<<endl;
cout<<atomicNo[i]<<"\t"<<endl;
cout<<"    "<<name[i]<<"\t"<<endl;
cout<<"                         "<<symbol[i]<<"\t"<<endl;
cout<<"                              "<<mass[i]<<endl;
break; 
}
