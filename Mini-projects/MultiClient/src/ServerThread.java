import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

public class ServerThread extends Thread{
	Socket socket ;
	BufferedReader reader;
	PrintWriter writer;
	String userNameTst;
	
	public ServerThread(Socket s) throws IOException{
		this.socket = s;
		
		reader = new BufferedReader(new InputStreamReader( this.socket.getInputStream() ) );
		writer = new PrintWriter(this.socket.getOutputStream());
		
		
		String userName = reader.readLine();
		System.out.println("Client Registered By : " + userName);

		
		Server.users.add(userName);
		Server.socketList.add(this.socket);
		
		userNameTst = userName;

	}
	
	
	
	
	public void run(){
		System.out.println("Thread Started !");
		try {
			while(true){
				String msg = reader.readLine();
				System.out.println(msg);
				StringTokenizer st = new StringTokenizer(msg);
				String reciever = st.nextToken();
				String tmp = userNameTst  + ":";
				String finalmsg = msg.replace(reciever, tmp );
				
				for(int i = 0 ; i < Server.users.size(); i++){
					
					if(Server.users.get(i).equals(reciever)){
						
						Socket sendTo = (Socket)Server.socketList.get(i);
						writer = new PrintWriter(sendTo.getOutputStream(), true);
						writer.println(finalmsg);
						System.out.println("message sent to " + reciever);
						
					}
					
				}
				
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
