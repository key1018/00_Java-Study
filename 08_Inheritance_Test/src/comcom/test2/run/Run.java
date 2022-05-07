package comcom.test2.run;

import comcom.test2.model.vo.Circle;
import comcom.test2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		
		// Circle
		
		Circle[] c = new Circle[2];
		
		c[0] = new Circle(1,2,3);
		c[1] = new Circle(3,3,4);
		
		// 향상된 for문 활용하여 출력
		for(Circle cl : c) {
			cl.draw();
		}
		
		// Rectangle
		
		Rectangle[] r = new Rectangle[2];
		
		r[0] = new Rectangle(-1,-2,5,2);
		r[1] = new Rectangle(-2,5,2,8);
		
		for(Rectangle rt : r) {
			rt.draw();
		}

	}

}
