public class Triangle extends GeometricObject{
	public double side1 = 1.0;
	public double side2 = 1.0;
	public double side3 = 1.0;
	
	public Triangle(){		
	}
	
	public Triangle(double side1,double side2,double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;	
	}

	public double getside1(){
		return side1;
	}
	public void setside1(double side1){
		this.side1 = side1;
	}
	
	public double getside2(){
		return side2;
	}
	public void setside2(double side2){
		this.side2 = side2;
	}
	
	public double getside3(){
		return side3;
	}
	public void setside3(double side3){
		this.side3 = side3;
	}
	
	@Override	
	public double getArea(){
		double s;
		s = (this.side1+this.side2+this.side3)/2;
		double Area;
		Area = ((s*(s-this.side1)*(s-this.side2)*(s-this.side3)));
		Area = Math.sqrt(Area);
		return Area;
	}

	public double getPerimeter(){
		double Perimeter;
		Perimeter = this.side1+this.side2+this.side3;
		return Perimeter;
	}
	
	public String toString(){
		return "The created triangle has the following properties: side1 is " + this.side1 + "side 2 is " + this.side2 + "side3 is " + this.side3 + "Area is " + getArea() + "Perimeter is " + getPerimeter();
	}
	
}