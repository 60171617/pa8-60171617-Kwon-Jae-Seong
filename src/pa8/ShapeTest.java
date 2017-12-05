//60171617 ���缺
//�� ���α׷��� ������ ��ǥ���� �Է����� ��, �� �� Ȥ�� �� ���� ��ǥ Ȥ�� ����,�ѷ��� ����ϴ� ���α׷��Դϴ�. ���� ���簢�� �Ѱ��� �� �ΰ��� �̷���� Bear��� ������ �ֽ��ϴ�.

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