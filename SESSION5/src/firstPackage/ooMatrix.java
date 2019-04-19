package firstPackage;
import java.awt.image.RescaleOp;
import java.util.Scanner;


public class ooMatrix {
	int data[][];
	int row, column;
	public static int count;
	public ooMatrix(int r, int c){
		this.row = r;
		this.column = c;
		this.data = new int [row][column];
		this.count ++;
		System.out.println("Number Of Objects : " + count);
	}
	//constractor
	
	public void fillMatrix(){
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				System.out.println("matrix[" + (i+1) + "][" + (j+1) + "]");
				data[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
		System.out.println("_.-._.-_._.-._.-_._.-._.-_._.-._.-_. \n");
	}
	//fill mikone 
	public void printMatrix(){
			
			for(int i=0; i<row; i++){
				for(int j=0; j<column; j++){
					System.out.print(data[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println("_.-._.-_._.-._.-_._.-._.-_._.-._.-_. \n");
		}
	//print mikone
	public ooMatrix transpose(){
		ooMatrix t = new ooMatrix(this.column, this.row);
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				t.data[j][i] = data[i][j];
			}
		}
		return t;
	}
	//transpose mikone 
	public int get(int r, int c){
		return(data[r][c]);
     }
	//return mikone Matix[r,c] ro 
	public ooMatrix multiply(ooMatrix second){
		ooMatrix result = new ooMatrix(this.row, this.column);
		for(int i=0; i<this.row; i++){
			for(int j=0; j<this.column; j++){
				int sum = 0;
				for(int k=0; k<this.column; k++){
					sum += this.data[i][k] * second.data[k][j];
				}
				result.data[i][j] = sum;
			}
		}
	return result;
	}
}
