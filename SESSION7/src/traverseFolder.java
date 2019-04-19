import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class traverseFolder {
	 public static void main(String[] args) {
		 File parent = new File("Data");
	/*	 if(parent.exists())
			 System.out.println("ok");
	 }*/
		 HashMap<String , ArrayList<String >> 
		 if(parent.isDirectory()){
			// File[] files = parent.listFiles();
			 for(File file : parent.listFiles()){
				System.out.println(file.getName()); 
				String ext = file.getName().substring(file.getName().length() - 5 );
			//	StringTokenizer tokenizer = new String StringTokenizer(endName,".");
				//String ext = tokenizer.nextToken();
			//	ext = tokenizer.nextToken()
				if ( extHash.)
				System.out.println(" \t\t" + ext); 
			 }
		 }
			 
	 }
}
