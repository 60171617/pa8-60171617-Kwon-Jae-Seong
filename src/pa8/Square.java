//60171617 권재성
//이 프로그램은 각각의 좌표들을 입력했을 때, 두 점 혹은 세 점의 좌표 혹은 넓이,둘레를 출력하는 프로그램입니다. 또한 정사각형 한개와 원 두개로 이루어진 Bear라는 도형도 있습니다.

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