import java.util.*;

public class arrayList {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter 0 when Your Strings finished : ");
		//int n = scanner.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		String string = scanner.next();
		list.add(string);
		while(!string.equals("end")){
			string = scanner.next();
			list.add(string);
		}
		list.remove(string);
		System.out.println("/./././././././././");
		System.out.println("Enter 1 to search Your word : ");
		System.out.println(" 1- Search \n 2- :) \n 3- :)) \n 4- :)))  ");
		int key = scanner.nextInt();
		if(key == 1){
			System.out.println("Enter You World To search In Your ArrayList ! ");	
			String searchLetter = scanner.next();
			if( list.contains(searchLetter) ){
				System.out.println("it contains Your Word ! ");	
			}
			else 
				System.out.println("it Does'nt contains Your Word ! ");	
		}
		
		else{
			
			while (key != 1){
				System.out.println("Enter 1 Dge !!!! ");
				key = scanner.nextInt();
			}	
			
			System.out.println("Enter You World To search In Your ArrayList ! ");	
			String searchLetter = scanner.next();
			
			if( list.contains(searchLetter) ){
				System.out.println("it contains Your Word ! ");	
			}
			
			else 
				System.out.println("it Does'nt contains Your Word ! ");
		}
	}
}
