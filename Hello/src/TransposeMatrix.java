
import java.util.Scanner;
public class TransposeMatrix 
{   
	public static int [][] transposeMatrix(int ar[][])
	{
		int row=ar.length;
		int col=ar[0].length;
		int nar[][] = new int[col][row];
		for(int i=0;i<nar.length;i++)
		{
			for(int j=0;j<nar[i].length;j++)
			{
				nar[i][j] = ar[j][i];
			}
		}
		return nar;
	}

	public static void main(String[] args)
	{
		System.out.println("Program starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int r = sc.nextInt();
		System.out.println("Enter the number of col");
		int c = sc.nextInt();
		int ar[][] = new int [r][c];
		System.out.println("Enter the array element");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				ar[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+ "");
			}
			System.out.println();
		}
		int ar1[][] = transposeMatrix(ar);
		System.out.println("The Transpose matrix is:");
		for(int i=0;i<ar1.length;i++)
		{
			for(int j=0;j<ar1[i].length;j++)
			{
				System.out.print(ar1[i][j]+"");
			}
			System.out.println();
		}
		System.out.println("Program ends");
	}

}
