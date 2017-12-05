//60171617 권재성
//이 프로그램은 각각의 좌표들을 입력했을 때, 두 점 혹은 세 점의 좌표 혹은 넓이,둘레를 출력하는 프로그램입니다. 또한 정사각형 한개와 원 두개로 이루어진 Bear라는 도형도 있습니다.

package pa8;

public class Bear implements Drawable {
	
	double x;
	double y;
	double radius;
	
	public Bear(double x, double y, double radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	public void draw() {
		
		System.out.println("Bear");
		
		Shape[] sh = new Shape[3];
		
		sh[0] = new Square(x,y,radius);
		sh[1] = new Circle(x-20,y-20,(radius*0.5));
		sh[2] = new Circle(x+radius,y-radius,(radius*0.5));
		
		for(int i=0;i<3;i++) {
			sh[i].draw();
			}
		
	
	}
}
	
