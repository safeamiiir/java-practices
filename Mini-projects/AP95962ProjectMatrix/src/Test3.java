import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		OOMatrix [] matrix= new OOMatrix[3];
		for(int i=0; i<matrix.length; i++)
		{
			System.out.println("Please enter row , column and name for matrix "+ (OOMatrix.count+1));
			int row = input.nextInt();
			int column = input.nextInt();
			//String name = input.nextLine();
			matrix[i] = new OOMatrix(row, column, "A");	
		}
		
		System.out.println(matrix[0].getRow());
		
	}

}
