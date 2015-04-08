/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i;
		for(i=0; i<10; i++)
		{
			System.out.println("For-loop "+i);
		}
		
		while(i>0)
		{
			System.out.println("While-loop "+ --i);
		}
		
		do{
			System.out.println("Do while-loop "+ i++);			
		}while(i<10);
	}
}
