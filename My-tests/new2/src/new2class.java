
public class new2class {
	private String name;
	private String family;
	private long id;
	private int  age;
	new2class(String hisname, String hisfamily, long hisid, int hisage){
		name = hisname ;
		family = hisfamily;
		id = hisid;
		age = hisage;
	}
		
	public static void main(String[] args){
		new2class aStu = new new2class("Ali", "aliyi", 95222001, 18);
		new2class bStu = new new2class("Ahmad", "Ahmadi", 95222002, 19);
		System.out.println("aStudent's name is : " + aStu.name);
		System.out.println("bStudent's ID is : " + bStu.id);
		
	}
}
