package in.ineuron.main;
import java.lang.*;

public class Pro3 {

	public static void main(String[] args) {
		
		
		int n=15;

		for(int j=0;j<n;j++)
		{
			for(int i=0;i<n;i++)
			{
				if(i==0||j==0||i==(n-1)||j==(n-1)||i+j<=(n)/2||i-j>=(n)/2)
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
