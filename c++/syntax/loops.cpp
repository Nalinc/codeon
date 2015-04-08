#include <iostream>
using namespace std;

int main() 
{
	int i,j;
	for(i=0; i<5; i++)
	{	
	  j=0;
		while(j<5)
		{
			cout<<"\t"<<i<<j;
			j++;
		}
		cout<<endl;
	}
	j=1;
	do{
		cout<<"\t" << j;
		j++;
	}while(j<10);
		
	return 0;
}
