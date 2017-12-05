//60171617 권재성
//이 프로그램은 각각의 좌표들을 입력했을 때, 두 점 혹은 세 점의 좌표 혹은 넓이,둘레를 출력하는 프로그램입니다. 또한 정사각형 한개와 원 두개로 이루어진 Bear라는 도형도 있습니다.

package pa8;

public abstract class Shape implements Drawable,Movable { //Shape라는 이름의 추상클래스이고 Drawable을 구현합니다.
	
	double area;
	double length;
	
	public double getArea() {return area;}
	
	public double getLength() {return length;}
	
	public void move(double dx, double dy) {
		}
		
	}