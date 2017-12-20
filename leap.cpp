#include <iostream>
using namespace std;

int main() 
{
	int yr;
	cin>>yr;
	if((yr%400)==0)
	cout<<"its leap year\t"<<yr;
	else if((yr%4)==0)
	cout<<"its leap year\t"<<yr;
	else if((yr%100)==0)
	cout<<"its not a leap year\t"<<yr;
	else 
	cout<<"its not a leap year\t"<<yr;

		return 0;
}
