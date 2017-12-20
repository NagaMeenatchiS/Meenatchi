#include <iostream>
using namespace std;

int main() 
{
    int n,i=0;
    cin>>n;
    while(n!=0)
    {
        n=n/10;
        i++;
    }
    cout<<"the no of digits:\t"<<i;

		return 0;
}
