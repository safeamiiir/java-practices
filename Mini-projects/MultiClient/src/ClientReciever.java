
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
public class ClientReciever extends Thread {
	
	Socket socket;
	BufferedReader reader;
	
	
	public ClientReciever(Socket s) throws IOException{
		this.socket = s;
		reader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
	}
	
	public void run( ){
		//System.out.println("Client thread for input Started !");
			try {
				while(true){
				String msg = reader.readLine();
				System.out.println(msg);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
