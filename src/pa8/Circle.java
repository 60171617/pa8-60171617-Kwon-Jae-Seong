//60171617 ���缺
//�� ���α׷��� ������ ��ǥ���� �Է����� ��, �� �� Ȥ�� �� ���� ��ǥ Ȥ�� ����,�ѷ��� ����ϴ� ���α׷��Դϴ�. ���� ���簢�� �Ѱ��� �� �ΰ��� �̷���� Bear��� ������ �ֽ��ϴ�.

package pa8;

public class Circle extends Shape{
	
	double x;
	double y;
	double radius;
	double area;
	double length;
	
	public double getArea() { return area;}
	
	public double getLength() { return length;}
	
	public void draw() {
		System.out.println("Circle center"+ "("+ x+ ","+ y+")"+ "-"+ "radius"+"("+radius+")");
	}
	
	public Circle(double x, double y, double radius) {
		
		this.x=x;
		this.y=y;
		this.radius=radius;
		area = 3.14 * radius * radius;
		length = 2 * 3.14 * radius;
	}
	
	public void move(double dx, double dy) {
		
		for(int i=0; i<10; i++) {	
		x+=dx;
		y+=dy;
		draw();
		}
		
		
		
	}
	
	
}