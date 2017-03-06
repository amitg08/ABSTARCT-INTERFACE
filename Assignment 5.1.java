
public class Abstraction {
	public static void main(String[] args){
		circle c = new circle();
		c.findArea();
		c.findPerimeter();
		
		rectangle r = new rectangle(4,2);
		r.findArea();
		r.findPerimeter();
		
		triangle t = new triangle(4,2);
		t.findArea();
		t.findPerimeter();
	}

}

abstract class figure{
	double dim1=10.0;
	abstract void findArea();
	abstract void findPerimeter();
	
}

class circle extends figure{
	double r = dim1/2;
	void findArea(){
		System.out.println("Area of circle is: " + r*r*Math.PI);
	}
	void findPerimeter(){
		System.out.println("Perimeter of circle is: " + 2*r*Math.PI);
	}
}

class rectangle extends figure{
	int l1,b1;
	rectangle(int l1, int b1){
		this.l1=l1;
		this.b1=b1;
	}
	void findArea(){
		System.out.println("Area of rectangle is: " + l1*b1);
	}
	void findPerimeter(){
		System.out.println("Perimeter of rectangle is: " + 2*(l1+b1));
	}
}

class triangle extends figure{
	int b, h;
	triangle(int b, int h){
		this.b=b;
		this.h=h;
	}
	void findArea(){
		System.out.println("Area of triangle is: " + (b*h)/2);
	}
	void findPerimeter(){
		System.out.println("Perimeter of triangle is: " + (b*h)/2);
	}
}