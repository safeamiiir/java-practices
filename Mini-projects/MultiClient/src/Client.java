import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("192.168.43.57", 9099);
			
		PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
		System.out.println("Enter a UseName First : ");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();
		writer.println(userName);		
		
		ClientReciever thread = new ClientReciever(socket);
		thread.start();
		
		while(true){
			String msg;
			msg = scanner.nextLine();
			writer.println(msg);
		}
	}


}
