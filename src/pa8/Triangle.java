//60171617 ���缺
//�� ���α׷��� ������ ��ǥ���� �Է����� ��, �� �� Ȥ�� �� ���� ��ǥ Ȥ�� ����,�ѷ��� ����ϴ� ���α׷��Դϴ�. ���� ���簢�� �Ѱ��� �� �ΰ��� �̷���� Bear��� ������ �ֽ��ϴ�.

package pa8;

public class Triangle extends Shape {
	
	double x;
	double y;
	double bottom;
	double width;
	double hypo; 
	
	public void draw() {
		
		double x2 = x - (bottom * 0.5);
		double x3 = x + (bottom * 0.5);
		double y2 = y - width;
		double y3 = y - width;
		
		System.out.println("Triangle"+ "("+ x+ ","+ y+ ")"+ ","+ "("+ x2 + ","+ y2 + ")" + "," + "("+ x3 + ","+ y3 + ")");
	}
	
	public double getArea() {return area;}
	
	public double getLength() {return length;}
	
	
	public Triangle(double x, double y, double bottom, double width) {
		
		this.x=x;
		this.y=y;
		this.bottom=bottom;
		this.width=width;
		
		double hypo=Math.sqrt(width*width + (0.5*bottom)*(0.5*bottom));
		
		area=width*bottom*0.5;
		length=(2*hypo)+bottom;
	}
}