package seri2Problem5DS;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> AyHa = new ArrayList<Integer>();
		ArrayList<Integer> JeyHa = new ArrayList<Integer>();
		ArrayList<Integer> maxI = new ArrayList<Integer>();
		ArrayList<Integer> maxJ = new ArrayList<Integer>();
		ArrayList<Integer> max = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0; i<n; i++ ){
			int itmp = scanner.nextInt();
			int jtmp = scanner.nextInt();
			AyHa.add(itmp);
			JeyHa.add(jtmp);
		}		
		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++){
				int tsti = AyHa.get(i) - AyHa.get(j);
				if(tsti < 0)
					tsti = -1*tsti;
				maxI.add(tsti);
				
			}
		}
		
		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++){
				int tstj =  JeyHa.get(i) - JeyHa.get(j);
				if(tstj < 0)
					tstj = -1*tstj;
				maxJ.add(tstj);
				
			}
		}
		 
		for(int i = 0; i < maxI.size(); i++){
				max.add(maxI.get(i) + maxJ.get(i));
				//System.out.println(maxI.get(i) + " | " + maxJ.get(i));

		}
		max.sort(null);
		System.out.println(max.get( max.size() -1 ));
	}

}
