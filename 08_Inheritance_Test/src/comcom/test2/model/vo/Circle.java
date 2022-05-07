package comcom.test2.model.vo;

public class Circle extends Point{
	
	private int radius; // 반지름;
	
	public Circle() {
		
	}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void draw() {
		// void 이므로 return 사용 불가능
		super.draw();
		System.out.printf("면적 : %.1f\n", (Math.PI * radius * radius));
		System.out.printf("둘레 : %.1f\n", (Math.PI * radius * 2));
	}
	
}
