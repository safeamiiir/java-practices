import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		Socket socket = new Socket("localhost", 9093);
		
		PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();	
		writer.println(userName);
		
		ClientReceiver thread = new ClientReceiver(socket);
		thread.start();
		
		while(true)
		{
			String msg;
			msg = scanner.nextLine();
			writer.println(msg);
		}
		
		
	}

}
