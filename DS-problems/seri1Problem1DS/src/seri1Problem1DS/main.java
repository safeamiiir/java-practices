package seri1Problem1DS;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		    	Scanner scanner = new Scanner(System.in);
		    	ArrayList<Integer> Array = new ArrayList<Integer>();

		    	int n = scanner.nextInt();
		    	for (int i = 0 ; i<n; i++){
		    		int tmp = scanner.nextInt();
		    		Array.add(tmp);
		    	}
		    	Array.sort(null);
		    	ArrayList<Integer> ArrayJavab = new ArrayList<Integer>();
		    	ArrayJavab.add(Array.get(0));
		    	for ( int j = 1; j<n-1; j++){
		    		int a = 0;
		    		if (ArrayJavab.get(a) != Array.get(j)){
		    			ArrayJavab.add(Array.get(j));
		    			a ++;
		    		}
		    	}
		    		
		    	//System.out.println(ArrayJavab);    	
		    	if (ArrayJavab.size() == 2)
		    		System.out.println("YES \n" + ArrayJavab.get(0) + '\t' + ArrayJavab.get(1));
		    	else
		    		System.out.println("NO");
		    	
		    	
		    }


	}
