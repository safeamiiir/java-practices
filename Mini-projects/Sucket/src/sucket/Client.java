package sucket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import org.omg.CORBA.portable.InputStream;

public class Client {

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost", 9097);
		
		java.io.InputStream in = socket.getInputStream();
		InputStreamReader input = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(input);
		System.out.println(reader.readLine());
		
	}

}
