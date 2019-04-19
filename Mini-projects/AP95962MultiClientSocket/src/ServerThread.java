import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class ServerThread extends Thread{

	Socket socket;
	BufferedReader reader;
	PrintWriter writer;
	
	public ServerThread(Socket s) throws IOException {
		// TODO Auto-generated constructor stub
		this.socket = s;
		
		reader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
		writer = new PrintWriter(this.socket.getOutputStream());
		
		String userName = reader.readLine();
		System.out.println("Client Registered by " + userName);
		
		Server.users.add(userName);
		Server.socketList.add(this.socket);
		
		
		
	}
	public void run()
	{
		System.out.println("Thread Started!");
		try {
			
			while(true)
			{
				String msg = reader.readLine();
				System.out.println(msg);
				StringTokenizer st = new StringTokenizer(msg);
				String receiver = st.nextToken();
				for (int i = 0; i < Server.users.size(); i++) {
					if(Server.users.get(i).equals(receiver))
					{
						Socket sendTo = (Socket)Server.socketList.get(i);
						writer = new PrintWriter(sendTo.getOutputStream(), true);
						writer.println(msg);
						System.out.println("Message sent to " + receiver);
					}
					
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
