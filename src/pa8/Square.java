//60171617 ���缺
//�� ���α׷��� ������ ��ǥ���� �Է����� ��, �� �� Ȥ�� �� ���� ��ǥ Ȥ�� ����,�ѷ��� ����ϴ� ���α׷��Դϴ�. ���� ���簢�� �Ѱ��� �� �ΰ��� �̷���� Bear��� ������ �ֽ��ϴ�.

package pa8;

public class Square extends Shape {
	
	double x;
	double y;
	double width;
	
	public void draw() {
		
		double x2 = x + width;
		double y2 = y + width;
		
		System.out.println("Square"+ "("+ (x-20)+ ","+ (y-20)+ ")"+ "-"+ "("+ x2 + ","+ y2 + ")");
	}
	
	public double getArea() { return area;}
	
	public double getLength() { return length;}
	
	public Square(double x, double y, double width) {
		
		this.x=x;
		this.y=y;
		this.width=width;
		area=width*width;
		length=4*width;

	}
}