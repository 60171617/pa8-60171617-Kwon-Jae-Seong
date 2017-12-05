//60171617 권재성
//이 프로그램은 각각의 좌표들을 입력했을 때, 두 점 혹은 세 점의 좌표 혹은 넓이,둘레를 출력하는 프로그램입니다. 또한 정사각형 한개와 원 두개로 이루어진 Bear라는 도형도 있습니다.

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