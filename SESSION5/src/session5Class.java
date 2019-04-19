
public class session5Class {
	public static void main(String[] args){
		ooMatrix matrix = new ooMatrix(2,3);
		matrix.fillMatrix();
		matrix.printMatrix();
		ooMatrix t = matrix.transpose();
		t.printMatrix();
		System.out.println(matrix.get(0 , 0));
		
	}
}
