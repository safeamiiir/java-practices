import java.util.*;
public class functional {
	public static void main(String[] args){
		int matrix [][] = new int [2][3];
		fillMatrix(matrix, 2, 3);
		printMatrix(matrix, 2, 3);
		int transposed[][] = new int [3][2];
		transpose(matrix, 2, 3, transposed);
		
		System.out.println(".-.-.-.-.-.-.-.-.-.-.-.");
		
		
		printMatrix(transposed, 3, 2);
		
	}
	
	public static void fillMatrix(int m[][], int r, int c){
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.println("matrix[" + (i+1) + "][" + (j+1) + "]");
				m[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
		
	}
	public static void printMatrix(int m[][], int r, int c){
		
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	public static void transpose(int m[][], int r,int c, int t[][]){
		
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				t[j][i] = m[i][j];
			}
		}
		
	}
	
	
}
