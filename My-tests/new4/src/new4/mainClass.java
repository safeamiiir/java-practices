package new4;

import java.util.ArrayList;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		float max = 0;
		float min = 0;
		float sum = 0;
		ArrayList<Float> array = new ArrayList<Float>();
		array.add(scanner.nextFloat());
		max = array.get(0);
		min = array.get(0);
		sum = array.get(0);
		for(int i = 1; i < (size); i++){
			array.add(scanner.nextFloat());
			if (array.get(i) > max ){
				max = array.get(i);
			}
			else if(array.get(i) < min){
				min = array.get(i);
			}
			sum += array.get(i);
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		System.out.println("Average = " + (sum/size) );
	}
}
