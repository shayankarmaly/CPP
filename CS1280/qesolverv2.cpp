// Karmaly, Shayan
// Homework #1
// 25 September 2019
// cs1280-01-f19
// Quadratic Equation Solver using if/else statements

// ask for variables a,b,c to input into the quadratic formula
#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;
int main ()
{
    // trying to find the quadratic formula 
    double a,b,c, x1, x2;



    cout<<"S.Karmaly's Simple Quadratic Equation Solver"<<endl;
    cout<<endl;

    cout<<"Enter values for a b c? ";
    cin>>a;
    cin>>b;
    cin>>c;

    cout<<endl;
    if (a==0)
    {
        cout<< "Not a quadratic equation."<< endl;
    }
    else
    {
        double discriminant = (b*b-4*a*c);
        if (discriminant >=0)
        {
        double x1= (-b+(sqrt(discriminant)))/(2*a);
        double x2= (-b-(sqrt(discriminant)))/(2*a);   
       
        cout<<setprecision(2)<<fixed<<showpoint<<"x1 = "<<x1<<endl;
        cout<<setprecision(2)<<fixed<<showpoint<<"x2 = "<<x2<<endl; 
        }
       else if (discriminant < 0) {
        cout<<"Roots are imaginary."<<endl;
       }
   
    }
   
    return 0;
}
