//60171617 ���缺
//�� ���α׷��� ������ ��ǥ���� �Է����� ��, �� �� Ȥ�� �� ���� ��ǥ Ȥ�� ����,�ѷ��� ����ϴ� ���α׷��Դϴ�. ���� ���簢�� �Ѱ��� �� �ΰ��� �̷���� Bear��� ������ �ֽ��ϴ�.

package pa8;

public class Rectangle extends Shape{
	
	double x;
	double y;
	double width;
	double height;
	double area;
	double length;
	double x2;
	double y2;
	
	public double getArea() { return area;}
	
	public double getLength() { return length; }
	
	public void draw() {
		double x2 = x + width;
		double y2 = y + height;
		
		System.out.println("Rectangle"+ "("+ x+ ","+ y+ ")"+ "-"+ "("+ x2 + ","+ y2 + ")");
		
	}
	
	public Rectangle(double x, double y, double width, double height) {
		
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		area = width * height;
		length = 2 * (width+height);
	}
}