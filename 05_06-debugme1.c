#include <stdio.h>

int main()
{
	int values[] = { 0xF, 0xFF, 0xFFF, 0xFFFF, 0xFFFFF };
	int *p,x;

	p = values;
	for(x=0;x<5;x++)
	{
		printf("%X\n",*p);
		p++;
	}

	return(0);
}

