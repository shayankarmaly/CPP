// ask for variables a,b,c to input into the quadratic formula
#include <iostream>

#include <iomanip>

#include <cmath>


using namespace std;
int main ()
{
    // trying to find the quadratic formula 
    double a,b,c;



    cout<<"S.Karmaly's Simple Quadratic Equation Solver"<<endl;
    cout<<endl;

    cout<<"Enter the values for a b c? ";
    cin>>a;
    cin>>b;
    cin>>c;

    cout<<endl;
   
    double x1= (-b+(sqrt(b*b-4*a*c)))/(2*a);
    double x2= (-b-(sqrt(b*b-4*a*c)))/(2*a);

    
    cout<<"x1 = "<<x1<<endl;
    cout<<"x2 = "<<x2<<endl;
    return 0;
}