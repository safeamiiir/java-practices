import java.util.*;
public class firstclass {
	public static void main(String[] args){
	/*	int A[] [] = {{ 1 , 2 } , { 0 , 3 } };
		//System.out.println(A[0][0]);
		String[] B = new String[2]; 
		A[0][0] = 2;
		B[0] = "hi";
		*/
		System.out.println("Enter The Numbers of line You Enter : ");
		Scanner Sc = new Scanner(System.in); 
		int Num = Sc.nextInt();
		for ( int i = 0 ; i < Num ; i++ ){
			for ( int l=0 ; l<10 ; l++ )
				System.out.print(' ');
			for ( int k = 0 ; k <Num-i-1 ; k++ )
				System.out.print(" ");
					for (int j = 0 ; j < 2*i+1 ; j++)
						System.out.print("*");	
					System.out.print('\n');
			}		
					for ( int i = 1 ; i < Num ; i++ ){
						for ( int l=0 ; l<10 ; l++ )
							System.out.print(' ');
						for ( int k = 0 ; k < i ; k++ )
							System.out.print(" ");
								for (int j = 0 ; j < 2*(Num-i)-1 ; j++)
									System.out.print("*");
								System.out.print('\n');
					}			
				
		
	}     
		
}

