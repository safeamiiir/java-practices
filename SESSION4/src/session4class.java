import java.util.*;

public class session4class {
	
	public static void main(String[] args){
		int matrix[][] = new int[3][4];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plz Fill THe Matrix : ");
		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++){
				System.out.println("matrix[" + (i+1) + "][" + (j+1) + "]");
				matrix[i][j] = scanner.nextInt();
			}
		}
		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
		int Transposed [][] = new int [4][3];
		
		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++){
				Transposed[j][i] = matrix[i][j];
			}
		}
		
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				System.out.print(Transposed[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

	
}
