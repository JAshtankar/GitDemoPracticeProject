package interfacesEx;

public class ShapeTest {

	public static void main(String[] args) {
		Shape sh=new Circle(2);
		sh.draw();
		System.out.println("area = "+sh.getArea());
		Shape sh2=new Rectangle(2, 5);
		sh2.draw();
		System.out.println("area = "+sh2.getArea());
		
	}

}
