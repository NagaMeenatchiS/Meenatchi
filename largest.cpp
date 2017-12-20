#include <iostream>
using namespace std;

int main() 
{
	int a,b,c;
	cout<<"enter the 3 inputs numbers\n";
	cin>>a>>b>>c;
	if(a>b&&a>c)
	cout<<"largest among 3 inputs is\t"<<a;
	else if(b>a&&b>c)
	cout<<"largest among 3 inputs is\t"<<b;
	else
	cout<<"largest among 3 inputs is\t"<<c;

		return 0;
}
