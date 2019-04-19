import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
public class ClientReceiver extends Thread{
	
	Socket socket;
	BufferedReader reader;
	
	public ClientReceiver(Socket s) throws IOException {
		// TODO Auto-generated constructor stub
		this.socket = s;
		reader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
		
	}
	
	public void run()
	{
		System.out.println("Client Thread for input started!");
		try {
			while(true)
			{
				String msg = reader.readLine();
				System.out.println(msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
