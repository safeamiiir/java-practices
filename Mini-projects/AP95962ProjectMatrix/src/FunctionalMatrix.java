import java.util.*;
public class FunctionalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 2;
		int column = 3;
		int matrix [][] = new int [row][column];
		matrix[0][0] = 100;
		matrix[0][1] = 200;
		matrix[0][2] = 300;
		matrix[1][0] = 101;
		matrix[1][1] = 202;
		matrix[1][2] = 303;
		
		fillMatrix(matrix, row, column);
		printMatrix(matrix, row, column);
		
		int transposed[][] = new int [column][row];
		transpose(matrix, row, column, transposed);
		printMatrix(transposed, column, row);
		
		
	}
	
	public static void fillMatrix(int m[][], int r, int c)
	{
		m = new int [2][3];
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.println("matrix["+(i+1)+"]["+(j+1)+"]");
				m[i][j] = scanner.nextInt();
			}
		}
	}
	public static void printMatrix(int m[][], int r, int c)
	{
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void transpose(int m[][], int r, int c, int t[][])
	{
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				t[j][i] = m[i][j];
			}
		}
	}

}
