package seri2Problem1;
import java.util.*;
public class Eratosthenes {

	public static void main(String[] args) {
		ArrayList<Integer> numbers =  new ArrayList<Integer>();
		setNumbers(numbers);
		//System.out.println(numbers);
		xnNuller(numbers);
		//System.out.println(numbers);
		zeroCleaner(numbers);
		System.out.println(numbers);
		
	}
	
	private static void setNumbers(ArrayList num){
		for(int i=0; i<500; i++){
			num.add(i+1);
		}
	} //setter 
	
	private static  void xnNuller(ArrayList<Integer> num){
		ArrayList<Integer> primes= new ArrayList<Integer>();
		for(int i=1; i<=500; i++){
			if(isPrime(i) == true){
				primes.add(i);
			}
		}
		for(int element : primes){
			for(int i=0; i<num.size(); i++){
				if((i+1) % element == 0){
					if ((i+1) != element)
						num.set(i,null);
				}
			}
		}
	} // it nulls  the numbers are not prime ! 
	
	private static boolean isPrime(int candidate) {
        if ((candidate & 1) == 0) {
            if (candidate == 2) {
                return true;
            } else {
                return false;
            }
        }
        for (int i = 3; (i * i) <= candidate; i += 2) {
            if ((candidate % i) == 0) {
                return false;
            }
        }
        return candidate != 1;
    } // it checks if numbers are prime 
	
	private static void zeroCleaner(ArrayList<Integer> num){
		while(num.contains(null))
			num.remove(null);
	} // it remoces null numbers !
	
}
