//60171617 권재성
//이 프로그램은 각각의 좌표들을 입력했을 때, 두 점 혹은 세 점의 좌표 혹은 넓이,둘레를 출력하는 프로그램입니다. 또한 정사각형 한개와 원 두개로 이루어진 Bear라는 도형도 있습니다.

package pa8;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50, 20, 30);
		
		for (Shape s : shapes) {
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n", s.getLength());
		}
	
		
		Drawable[] drawables = new Drawable[5];
		for (int i=0; i < shapes.length; i++) { 
			drawables[i] = shapes[i];
		}
		
		drawables[3] = new Text("Sample Text");
		drawables[4] = new Bear(100, 100, 20);
		
		for(Drawable d : drawables) {
			d.draw();
		}
		
		Movable[] movables = new Movable[1];
		
		movables[0] = new Circle(100, 100, 20);
		
		for(Movable m : movables) {
			m.move(10,10);
		}
		
		
		
		
		
		}	
	}		