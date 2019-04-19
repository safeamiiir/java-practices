package seri2Problem4;
import java.lang.reflect.Array;
import java.util.*;
public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number (Mad or Normal) : ");
		String string = scanner.next();
		if(string.contains("R") == true & !string.contains("RR") & !string.contains("RC") & string.contains("C") ){
			madMod(string);
		}
		else{
			olampyadMod(string);
		}
	}

	public static void olampyadMod(String string){
		ArrayList<Integer> array = new ArrayList<Integer>();
		String startLetter = new String();
		//startLetter.valueOf(65);
		int askiMaker = 65;
		int nextStr = 0;
		int rowSum = 0;
		String columnSum ;
		while(string.charAt(nextStr) != 49 &
			  string.charAt(nextStr) != 50 &
			  string.charAt(nextStr) != 51 &
			  string.charAt(nextStr) != 52 &
			  string.charAt(nextStr) != 53 &
			  string.charAt(nextStr) != 54 &
			  string.charAt(nextStr) != 55 &
			  string.charAt(nextStr) != 56 &
			  string.charAt(nextStr) != 57 ){
				
			while(string.charAt(nextStr) != askiMaker){
				//startLetter.valueOf(0);
				askiMaker++;
			}
			//System.out.println(i);
			array.add(askiMaker - 65 + 1);
			//System.out.println(array);
			nextStr++;
		}
		for(int i=0,ii = array.size()-1; i<array.size(); i++,ii--){
			rowSum += Math.pow(26,i)*array.get(ii);
		}
		columnSum = string.substring(nextStr);
		System.out.println("R" + columnSum + "C" + rowSum);
	}	
	public static void madMod(String string){
		string = string.substring(1);
		int n = 0;
		while(string.charAt(n) != 67)
			n++;
		String columnStr = string.substring(n+1);
		String rowStr = string.substring(0 , n);
		//System.out.println(rowStr + "\t" + columnStr);
		int row = Integer.parseInt(rowStr);
		int column = Integer.parseInt(columnStr);
		//System.out.println(row + "\t" + column);
		numToAbcPrinter(column , row);
	}
	public static void numToAbcPrinter(int m,int rowStr){
		ArrayList<Integer> a = new ArrayList<Integer>();
		while( m != 0 ){	
			int n = 1;
			while( m /  (int) (Math.pow(26, n))  != 0){
				n++;
			}
			n--;
			int aa = (int) (m / Math.pow(26, n));
			a.add( aa + 65 -1);
			m = m - (int)( aa * Math.pow(26, n) );
			
		}
		//System.out.println(a);
		//ArrayList<Character> alpha = new ArrayList<Character>();
		char [] alpha = new char [a.size()];
		for(int i=0; i<a.size(); i++){
			int tmp = a.get(i);
			alpha[i] = (char) (tmp);
		}
		System.out.print(alpha);
		System.out.print(rowStr);

	}
		
}
