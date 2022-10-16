package programs;

public class Rectangle {
	
	private double length;
	private double breadth;
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double l) {
	
		if(l>=0)
			length=l;
		else
			length=0;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double b) {
		breadth=b;
	}
	

}
