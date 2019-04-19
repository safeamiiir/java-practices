package sample;
import java.util.Scanner;
public class OOMatrix {
	
	public static int count;
	private int [][] data;
	private int row;
	private int column;
	String name;
	private int id;
	
	public int getRow()
	{
		return this.row;
	}
	
	public int getId()
	{
		return this.id;
	}
	public int getColumn()
	{
		return this.column;
	}
	public OOMatrix(int r, int c, String n)
	{
		this.row = r;
		this.column = c;
		this.data = new int [row][column];
		this.name = n;
		this.count ++;
		System.out.println("NUmber of Objects : " + this.count);
		this.id = this.count;
	}
	
	public void fillMatrix()
	{
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.println("matrix["+(i+1)+"]["+(j+1)+"]");
				data[i][j] = scanner.nextInt();
			}
		}
	}

	public void printMatrix()
	{
		System.out.println(this.name);
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n");
	}

	public OOMatrix transpose()
	{
		OOMatrix t = new OOMatrix(this.column, this.row, "Transposed");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				t.data[j][i] = data[i][j];
			}
		}
		return t;
	}

	public int get(int r, int c)
	{
		return data[r][c];
	}
	
	public OOMatrix multiply(OOMatrix s)
	{
		OOMatrix result = new OOMatrix(this.row, s.column, "Multiplication Matrix");
		for(int i=0; i<this.row; i++)
		{
			for(int j=0; j<s.column; j++)
			{
				/*
				int sum = 0;
				for(int k=0; k<this.column; k++)
				{
					sum += this.data[i][k] * s.data[k][j];
				}
				result.data[i][j] = sum;
				*/
				result.data[i][j] = multiplyByRow(i, j, s);
			}
		}
		
		return result;
	}
	
	private int multiplyByRow(int r, int c, OOMatrix s)
	{
		int sum = 0; 
		for(int i=0; i<this.column; i++)
		{
			sum += this.data[r][i] * s.data[i][c];
		}
		return sum;
	}

	public static boolean checkCompatibility(OOMatrix m1, OOMatrix m2)
	{
		boolean flag = false;
		if(m1.getColumn() == m2.getRow())
			flag = true;
		else
			flag = false;
		
		return flag;
	}
	
	protected void setRow(int r)
	{
		this.row = r;
	}
	
	protected void setColumn(int c)
	{
		this.column = c;
	}
}
