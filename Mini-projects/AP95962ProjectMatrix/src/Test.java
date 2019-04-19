import java.awt.Toolkit;
import java.awt.im.InputContext;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		OOMatrix first = new OOMatrix(2, 3, "A");
		first.fillMatrix();
		
		
		//first.printMatrix();
		//OOMatrix t = first.transpose();
		//t.printMatrix();
		
		OOMatrix second = new OOMatrix(3, 3, "B");
		second.fillMatrix();
		
		OOMatrix result = first.multiply(second);
		
		first.printMatrix();
		second.printMatrix();
		result.printMatrix();
		
	}

}
