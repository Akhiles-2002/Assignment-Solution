package in.ineuron.main;
import java.lang.*;

public class PrintIneuron {

	public static void main(String[] args) {
		
		int n=7;
	
		//for I
		
		for(int j=0;j<n;j++) 
		{
			for(int i=0;i<n;i++)
			{
				if(i==(n-1)/2 || j==0 || j==n-1)
				{
				    System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	System.out.println("      ");

	
	//for N
	for(int j=0;j<n;j++)  
	{
		for(int i=0;i<n;i++)
		{
			if(i==0||i==j||i==(n-1))
			{
			    System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	
	System.out.println("         ");

	 //for E
	for(int j=0;j<n;j++) 
	{
		for(int i=0;i<n;i++)
		{
			if(i==0||j==0||j==(n-1)/2||j==(n-1))
			{
			    System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	System.out.println("         ");

	//for U	
	
	for(int j=0;j<n;j++)  
		
	{
		for(int i=0;i<n;i++)
		{
			if(i==0 && j<(n-1) ||j==(n-1) && i!=0 && i!=(n-1) || i==(n-1) && j!=(n-1))
			{
			    System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	System.out.println("      ");  
	
	//for R
	for(int j=0;j<n;j++)
	{
		for(int i=0;i<n;i++)
		{
			if( i==0 || j==0 && i!=(n-1) || j==(n-1)/2 && i!=(n-1) ||
					i==(n-1) && j!=0 && j!=(n-1)/2 && j<=(n-1)/2
					|| i==j                              //&& i>=(n-1/2)/2
					&& j>=(n-1)/2
					)          //i==(n-1) &&  j!=0 && j!=(n-1) && j<=(n-1)/2 && j!=(n-1)
				 
			{
			    System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}

System.out.println("      ");


//For O
for(int j=0;j<n;j++) 
{
	for(int i=0;i<n;i++)
	{
		if( i==0 && j!=0 && j!=(n-1) || j==0 && i!=0 && i!=(n-1) ||j==(n-1) && 
				i!=(n-1) && i!=0
				|| i==(n-1) && j!=0 && j!=(n-1))
				
		{
		    System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println();
}
	
  System.out.println();
  
 
  //For N
	for(int j=0;j<n;j++)
	{
		for(int i=0;i<n;i++)
		{
			if(i==0||i==j||i==(n-1))
			{
			    System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}




}
}
