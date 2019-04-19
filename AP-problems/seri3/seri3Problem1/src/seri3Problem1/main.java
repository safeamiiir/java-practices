package seri3Problem1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.omg.CORBA.TRANSACTION_MODE;

public class main {

	public static void main(String[] args) throws IOException {
		File file = new File("phoneNumber.txt");
		FileWriter fileWriter = new FileWriter(file, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		Scanner scanner = new Scanner(System.in);
		while( true ){
			String input;
			System.out.println(" Enter Name of Whom You Want to Save in Your Phone Number : " );
			System.out.println(" Write \"end\" to Stop Importing ! " );
			input = scanner.next();
			if( input.equals( "end" ) )
				break;
			bufferedWriter.write(input);
			bufferedWriter.write(' ');
			System.out.println(" Enter Number of Whom You Want to Save in Your Phone Number : " );
			input = scanner.next();
			bufferedWriter.write(input);
			bufferedWriter.write('\n');
		}
		bufferedWriter.close();
		fileWriter.close();
		
		FileReader fileReader = new FileReader("phoneNumber.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		//System.out.println(bufferedReader.readLine());
		System.out.println(" Enter The Name You Want to Search : " );
		String searcher = scanner.next();
		while(true){
			String tmp = bufferedReader.readLine();
			if(tmp.contains(searcher)){
				String splits[] = tmp.trim().split(" ");
				System.out.println(splits[0] + "\'s Number Is " + splits[1]);
				break;
			}
		}
	}

}
