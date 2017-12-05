//60171617 권재성
//이 프로그램은 각각의 좌표들을 입력했을 때, 두 점 혹은 세 점의 좌표 혹은 넓이,둘레를 출력하는 프로그램입니다. 또한 정사각형 한개와 원 두개로 이루어진 Bear라는 도형도 있습니다.

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