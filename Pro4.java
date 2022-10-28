package in.ineuron.main;

public class Pro4 {

	public static void main(String[] args) {
		
		int n=15;

		for(int j=0;j<n;j++)
		{
			for(int i=0;i<n;i++)
			{
				if(j==(n-1)||j==n||j-i>=(n-1)/2||i+j>=(n-1)+(n-1)/2)
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
