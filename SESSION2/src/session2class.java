import java.util.Scanner;

public class session2class {
 public static void main(String [] args){
	 int size;
	 System.out.println("Plz Enter Fucki'n Num : ");
	 Scanner input = new Scanner (System.in);
	 size = input.nextInt();
	 int grades[] = new int[size];
	 for(int i=0; i<grades.length; i++){
		 System.out.println("Enter a Grade : ");
		 grades[i] = input.nextInt();
	 }
	 float average;
	 float sum = 0;
	 for(int i=0; i<grades.length; i++){
		 sum += grades[i];
	 }
	 average = sum/grades.length;
	 System.out.println(average);
 }
}
