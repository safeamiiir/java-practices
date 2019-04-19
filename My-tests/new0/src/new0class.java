
public class new0class {
	private double radius;
	public double getArea(){
		return radius * radius * 3.14;
	}
	public new0class(double r ){
		radius = r;
	}
	public new0class(){
		
	}
	public static void main(String[] args){
		new0class c = new new0class(2);
		new0class b = new new0class();
		System.out.println(c.getArea());
		System.out.println(b.getArea());
	}
}
