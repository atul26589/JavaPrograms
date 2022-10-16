package programs;

public class CyclinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cylinder c=new Cylinder();
		c.setHeight(10);
		c.setRadius(4);
		c.setDimensions(11, 7);
		System.out.println("Volume : "+c.volume());
		System.out.println("Height : "+c.perimeter() );
		System.out.println("Height: "+c.getHeight());
	}

}
