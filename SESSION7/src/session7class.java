import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class session7class {
	 public static void main(String[] args) {
		 HashMap<String, String> hash = new HashMap<String,String>();
		 hash.put("Pdf", "myPsh.pdf");
		 hash.put("txt", "mytxt.txt");
		 hash.put("Jpeg", "myJpeg.Jpeg");
		 
		 for(Map.Entry<String, String> entry : hash.entrySet() ){
			 System.out.println(entry.getKey());
			 System.out.println("\t \t " + entry.getValue());
		 }
		 
		 HashMap< String, ArrayList<String> > multyHash = new HashMap<String , ArrayList<String> >();
		 
		
		 ArrayList<String> list = new ArrayList<String>();
		 list.add("file1.txt");
		 list.add("file2.txt");
		 list.add("file3.txt");
		 list.add("file4.txt");
		 
		 multyHash.put("txt", list);

		 
		 list = new ArrayList<String>();
		 list.add("file11.pdf");
		 list.add("file21.pdf");
		 list.add("file31.pdf");
		 list.add("file41.pdf");
		 
		 multyHash.put("pdf", list);

		 
		 list = new ArrayList<String>();
		 list.add("file13.txt");
		 list.add("file23.txt");
		 
		 multyHash.put("Jpeg", list);
		 
		 for(Map.Entry<String, ArrayList<String>> entry : multyHash.entrySet() ){
			 System.out.println(entry.getKey());
			 for(String Item : entry.getValue() ){
				System.out.println("\t\t" + Item);
			 }
			 System.out.println();
		 }
		 
		 
	 }
}
