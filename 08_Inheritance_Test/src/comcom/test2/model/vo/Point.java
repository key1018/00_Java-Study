package comcom.test2.model.vo;

public class Point {
	
	private int x;
	private int y; 
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void draw() {
		// 자료형이 void이므로 바로 출력할 수 있도록 System.out.println 사용
		System.out.println("(x, y) : " + "(" + x + ", " + y + ")");
	}

}
