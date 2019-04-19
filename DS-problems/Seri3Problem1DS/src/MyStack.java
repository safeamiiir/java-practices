import java.util.Scanner;


public class MyStack {
		   private int maxSize;
		   private long[] stackArray;
		   private int top;
		   
		   public MyStack() {
		      maxSize = 1000;
		      stackArray = new long[maxSize];
		      top = -1;
		   }
		   public void push(long j) {
		      stackArray[++top] = j;
		   }
		   public long pop() {
		      return stackArray[top--];
		   }
		   public long top() {
		      return stackArray[top];
		   }
		   public boolean isEmpty() {
		      return (top == -1);
		   }
		   
		   public static void main(String[] args) {
				int [] Array = new int [2000];
				int n = 0;
			    int i;
			    Scanner scanner = new Scanner(System.in);
			    while ( 1 == 1 ) {
			        n = scanner.nextInt();
			        if (n == 0)
			            break;
			        
			        while ( 1 == 1 ) {
			        	Array[0] = scanner.nextInt();
			            if (Array[0] == 0){
			                System.out.println("\n");
			                break;
			            }
			            
			            for (i = 1; i < n; i++) {
			            	Array[i] = scanner.nextInt();
			            }
			            
			            int wagon = 1;
			            int ArrayIndex = 0;
			            MyStack station = new MyStack();
			            while(wagon <= n){
			                station.push(wagon);
			                
			                while(!station.isEmpty() && station.top() == Array[ArrayIndex]){
			                    station.pop();
			                    ArrayIndex++;
			                    if(ArrayIndex >= n)
			                    	break;
			                }
			                wagon++;
			            }
			            
			            if(station.isEmpty())
			            	System.out.println("Yes" + " \n");
			            else
			            	System.out.println("No" + " \n");
			        }
			    }
	}
}
