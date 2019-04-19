import java.util.*;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matrix [][] = new int[3][4];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please fill Matrix:");
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.println("matrix["+(i+1)+"]["+(j+1)+"]");
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		int transposed [][] = new int [4][3];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				transposed[j][i] = matrix[i][j];
			}
		}
		System.out.println("\n\n\n");
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(transposed[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
