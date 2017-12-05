//60171617 ���缺
//�� ���α׷��� ������ ��ǥ���� �Է����� ��, �� �� Ȥ�� �� ���� ��ǥ Ȥ�� ����,�ѷ��� ����ϴ� ���α׷��Դϴ�. ���� ���簢�� �Ѱ��� �� �ΰ��� �̷���� Bear��� ������ �ֽ��ϴ�.

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
	
