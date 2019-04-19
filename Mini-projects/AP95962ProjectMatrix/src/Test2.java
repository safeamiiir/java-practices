
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OOMatrix matrix1, matrix2, matrix3;
		matrix1 = new OOMatrix(2, 3, "A");
		matrix2 = new OOMatrix(3, 2, "B");
		matrix3 = new OOMatrix(3, 3, "C");
		
		System.out.println(matrix1.getId());
		System.out.println(matrix2.getId());
		System.out.println(matrix3.getId());
		System.out.println(matrix1.count);
		System.out.println(matrix2.count);
		System.out.println(matrix3.count);
		System.out.println(OOMatrix.count);
		
		if(OOMatrix.checkCompatibility(matrix1, matrix2))
			System.out.println("Matrix1 * Matrix2 is possible");

		if(OOMatrix.checkCompatibility(matrix1, matrix3))
			System.out.println("Matrix1 * Matrix3 is possible");

		if(OOMatrix.checkCompatibility(matrix2, matrix1))
			System.out.println("Matrix2 * Matrix1 is possible");

		if(OOMatrix.checkCompatibility(matrix2, matrix3))
			System.out.println("Matrix2 * Matrix3 is possible");

		if(OOMatrix.checkCompatibility(matrix3, matrix1))
			System.out.println("Matrix3 * Matrix1 is possible");

		if(OOMatrix.checkCompatibility(matrix3, matrix2))
			System.out.println("Matrix3 * Matrix2 is possible");

	}

}
