import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class Server {

	
	public static ArrayList<String> users = new ArrayList<String>();
	public static ArrayList<Socket> socketList = new ArrayList<Socket>();
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ServerSocket listener = new ServerSocket(9093);
		System.out.println("Server Started!");
		while(true)
		{
			Socket socket = listener.accept();
			System.out.println("Client Connected!");
		
			ServerThread thread = new ServerThread(socket);
			thread.start();
		}
		
		
	}

}
