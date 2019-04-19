package seri2Problem2;
import java.awt.print.Printable;
import java.util.*;
public class matrixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter Number Of Columns : ");
		int m =  scanner.nextInt();
		System.out.println("Enter Number Of rows : ");
		int n = scanner.nextInt();
		int [][] unarranged = new int [m][n];
		fillMatrix(m, n, unarranged);
		printMatrix(m, n, unarranged);
		ArrayList<Integer> arrange = new ArrayList<Integer>();
		matrixToSortedArrayList(m, n, unarranged, arrange);
		//System.out.println(arrange);
		printSortedArraylistToMatrix(m, n, arrange);

	} 
	
	
	public static void fillMatrix(int m, int n, int unarranged [][]){
		Scanner scanner = new Scanner(System.in);
		for(int i =0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.println("matrix[" + (i+1) + "][" + (j+1) + "]");
				unarranged[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(int m, int n, int unarranged [][]){
		
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(unarranged[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("_.-._.-_._.-._.-_._.-._.-_._.-._.-_. \n");
	}

	public static void  matrixToSortedArrayList(int m, int n, int unarranged [][], ArrayList<Integer> un){
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				un.add(unarranged[i][j]);
			}
		}
		
		un.sort(null);
	}

	public static void printSortedArraylistToMatrix(int m, int n,  ArrayList<Integer> sor){
		System.out.println("Sorted Matrix Is : ");
			for(int i=0; i<m*n; i++){
				System.out.print(sor.get(i) + " ");
				if((i+1) % n == 0 )
					System.out.println();
			}
	}

}
