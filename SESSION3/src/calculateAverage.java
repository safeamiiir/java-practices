import java.util.*;

public class calculateAverage {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float average = 0;
		float grade = input.nextInt();
		ArrayList<Float> list = new ArrayList<Float>();
		while(grade != -1.0f){
			list.add(grade);
			grade = input.nextFloat();
		}
		
		if(list.size()>0){
			float sum = 0;
			for(float g:list){
				sum += g;
			}
			average = sum / list.size();
		}
		else 
			average = 0;
		System.out.println(average);
	}
}
