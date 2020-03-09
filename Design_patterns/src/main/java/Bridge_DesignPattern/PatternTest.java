package Bridge_DesignPattern;



import Bridge_DesignPattern.GreenColor;
import Bridge_DesignPattern.Pentagon;
import Bridge_DesignPattern.RedColor;
import Bridge_DesignPattern.Shape;
import Bridge_DesignPattern.Triangle;

public class PatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}
