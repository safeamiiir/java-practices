package seri1Problem2DS;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int alaki = scanner.nextInt();
		String inp = scanner.next();
		
		if(inp.length() == alaki){
			
			for (int i = 65; i < 91; i++){
				String upper = Character.toString((char)i);
				inp = inp.replace(upper , " ");			
			}
			scanner.close();
			//System.out.println(inp);
			String [] noUpperarray = inp.trim().split(" ");
			//for(int i = 0 ; i<noUpperarray.length;i++){
				//System.out.println(noUpperarray[i]);
		//	}
			ArrayList<String> fArray = new ArrayList<String>();
	    	for(int i = 0; i < noUpperarray.length; i++){
	    		String tmp = noUpperarray[i];
	    		noUpperarray[i] = removeRepeated(tmp);
	    		
	    	}
			
	//		for(int i = 0 ; i<noUpperarray.length; i++){
	//		System.out.println(noUpperarray[i]);
	//	}
	    	
	    	ArrayList<Integer> size = new ArrayList<Integer>();
	    	for(int i = 0; i<noUpperarray.length; i++){
	    		size.add(noUpperarray [i].length());
	 
	    	}
	    	size.sort(null);
	    	System.out.println(size.get(size.size()-1));
		}
	}
	
	
	public static String removeRepeated(String string){

		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		return sb.toString();
	}


}
