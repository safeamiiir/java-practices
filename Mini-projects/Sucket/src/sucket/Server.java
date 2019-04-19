package sucket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException{
		
		ServerSocket listener = new ServerSocket(9097);
		
		System.out.println("ServerIs Running On Port 9097");
		Socket socket = listener.accept();
		System.out.println("A New Client Is Connected To The Server !");
		
		OutputStream out = socket.getOutputStream();
		OutputStreamWriter writer = new OutputStreamWriter(out);
		writer.write(" Hello ");
		writer.flush();
		
		writer.close();
		socket.close();
		listener.close();
		
	}

}
