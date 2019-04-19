package second;

import sample.OOMatrix;

public class SquareMatrix extends OOMatrix{

	public SquareMatrix(int r, int c, String n) {
		super(r, c, n);
		
		if(c != r)
			setColumn(r);
		// TODO Auto-generated constructor stub
	}

}
