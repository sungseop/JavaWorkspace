package Exercise;

public class Cylinder extends Circle {
	private double height = 1.0;	// 원통의 높이
	
	public Cylinder() {
		super();	// 부모자 생성자 호출. 생략 가능.
	}
	
	public Cylinder(double height) {
		super();   // 부모자 생성자 호출. 생략 가능.
		this.height = height;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);  
        // 또는
		//setRadius(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return super.getArea() * height; 
	}
	
	/* 원기둥의 표면적을 구하는 메소드 */
	public double getArea() {
		
		return (2*Math.PI*getRadius()*height) + (2*super.getArea());
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", radius=" + getRadius() 
				+ ", color=" + getColor() + "]";
	}

}









