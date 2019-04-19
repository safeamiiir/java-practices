import java.util.ArrayList;


public class session3class {
	public static void main(String[] args){
		
		int array[] = new int[3];
		array[0] = 10;
		array[1] = 15;
		array[2] = 17;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(17);
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		System.out.println("-.-.-.-.-.-.-.-.-.-.");
		
		for(int element : list){
			System.out.println(element);
		} //for each !
		
		System.out.println("-.-.-.-.-.-.-.-.-.-.");
		
		ArrayList<Object> generalList = new ArrayList<Object>();
		generalList.add(10);
		float x = 3.2f;
		generalList.add(x);
		generalList.add("     Hello Beach ! ");
		
		for (Object obj : generalList){
			System.out.println(obj);
		} //just printing THe generalList !
		
		System.out.println("-.-.-.-.-.-.-.-.-.-.");
		
		for (Object obj : generalList){
			if(obj.getClass() == Integer.class){
				System.out.println(2*(Integer)obj);
			}
			if(obj.getClass() == Float.class){
				System.out.println(2*(Float)obj);			
			}
			if(obj.getClass() == String.class){
				System.out.println((String)obj);
			}
		} //Processing This motherFuckers !
		
		
		System.out.println("-.-.-.-.-.-.-.-.-.-.");
		System.out.println(generalList.get(2));
		System.out.println(generalList.get(0).getClass());
		System.out.println(generalList.get(1).getClass());
		
	}
}
