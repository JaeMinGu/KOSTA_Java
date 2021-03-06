
public class PolymorphismExample {

	public static void main(String[] args) {
		// 클래스 형변환(Up Casting)
		Shape shape = null; 
//		shape = new Shape(); 
		
		shape = new Circle(10, 10, 20);
		System.out.println(shape); 
		
		shape = new Rectangle(10, 10, 10, 20); 
		System.out.println(shape);
		
		System.out.println(shape.x);
		System.out.println(shape.getArea());
		
		// 추가된 속성이나 메소드를 접근하기 위해 Down Casitng 필요 
		Rectangle rectangle	= (Rectangle)shape;
//		System.out.println(rectangle.getWidth);
		
		System.out.println(shape instanceof Object);
		System.out.println(shape instanceof Shape);
		System.out.println(shape instanceof Rectangle);
//		System.out.println(shape instanceof String);
		
		
	}

}
