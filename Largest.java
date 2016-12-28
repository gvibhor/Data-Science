import java.util.*;

class Demo
{
    public static void main(String a[])
      {
         int x,i,big=0;
	for(i=0;i<3;i++)
	{
		
		x=Integer.parseInt(a[i]);
		if(big<x)
		{
		   big=x;
		}
		
	}
		System.out.println("Largest value is :"+big);
}}