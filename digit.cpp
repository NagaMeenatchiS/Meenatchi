#include <iostream>
using namespace std;

int main() 
{
    int n,i=0;
    cin>>n;
    if(n!=0)
    {
    while(n!=0)
    {
        n=n/10;
        i++;
    }
    }
    else 
{
    cout<<"input is zero\n";
}
    cout<<"the no of digits:\t"<<i;

		return 0;
}
