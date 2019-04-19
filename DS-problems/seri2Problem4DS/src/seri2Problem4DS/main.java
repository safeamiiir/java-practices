package seri2Problem4DS;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int inp = scanner.nextInt();
		int counter = 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0 ; i < inp; i++){
			int tmp = scanner.nextInt();
			numbers.add(tmp);
		}
		for(int i = 0; i < inp; i++){
			for(int j = i; j < inp; j++){
				if(numbers.get(i)>numbers.get(j))
					counter ++;
			}
		}
		
		System.out.println(counter);
		
		
	}

}
