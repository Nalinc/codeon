/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,j;
		for(i=0; i<5; i++)
		{	
			j=0;
			while(j<5)
			{
				System.out.print("\t"+i+j);
				j++;
			}
			System.out.println();
		}
		j=1;
		do{
			System.out.print("\t"+j);
			j++;
		}while(j<10);
	}
}
