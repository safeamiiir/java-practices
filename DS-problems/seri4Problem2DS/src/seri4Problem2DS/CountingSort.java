package seri4Problem2DS;

import java.util.*;

public class CountingSort{
 
  public static int[] sort(int[] array) {
     
    int[] aux = new int[array.length];
 
    int min = array[0];
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      } else if (array[i] > max) {
        max = array[i];
      }
    }
 

    int[] counts = new int[max - min + 1];
 
    for (int i = 0;  i < array.length; i++) {
      counts[array[i] - min]++;
    }
 
    counts[0]--;
    for (int i = 1; i < counts.length; i++) {
      counts[i] = counts[i] + counts[i-1];
    }

    for (int i = array.length - 1; i >= 0; i--) {
        aux[counts[array[i] - min]--] = array[i];
    }
 
    return aux;
  }
 
  public static void main(String[] args) {
	  
	  ArrayList<Integer> answer = new ArrayList<Integer>();
	  Scanner scanner = new Scanner(System.in);
	  int imp = scanner.nextInt();
	  int count = imp;
	  while( imp != 0 ){
		  int [] array = new int[imp] ;
		  for(int i = 0; i < imp; i++){
			  array [i] = scanner.nextInt();
		  }		 
		  int [] sortedarray = sort(array);
		  for(int i = 0; i < imp; i++){
			 answer.add(sortedarray [i]);
		  }	
		  answer.add(-1);
		  count += 1;
		  imp = scanner.nextInt();
		  count += imp;
	  }
	//  System.out.println(count);	  
	 // System.out.println(answer);
	  for (int item : answer){
		  if(item == -1){

			  System.out.println();
			  answer.remove()
			  
		  }
		  System.out.print(item + " ");
	  }
  }
}