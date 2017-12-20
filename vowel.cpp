#include <iostream>
using namespace std;

int main() 
{
	char o;
	cout<<"enter the charater in lower case\n";
	cin>>o;
	if (o=='a'||o=='e'||o=='i'||o=='o'||o=='u')
	{
	    cout<<"its vowel\t"<<o;
	}
	else
	{
	    cout<<"its  consonant\t"<<o;
	}
	return 0;
}
