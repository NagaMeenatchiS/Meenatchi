#include <iostream>
using namespace std;

int main() 
{
	char o;
	cout<<"enter the value:\n";
	cin>>o;
	if (isalpha(o))
	{
	    cout<<"its alphabet\t"<<o;
	}
	else
	{
	    cout<<"its not a alphabet\t"<<o;
	}
	return 0;
}
