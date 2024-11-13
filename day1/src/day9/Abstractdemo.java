package day9;

public abstract class Abstractdemo {

	public static void main(String[] args) {
		Square sq=new Square();
		Rectangle r1=new Rectangle();
		sq.calArea();
		sq.show();
		r1.calArea();
		r1.show();
		
		System.out.println("------------------------------------------------");
		//Runtime Polymorphism / Dynamic binding / late binding
		//Ex: Method Overriding
		
		Rectangle shape;
		shape=new Rectangle();
		
		shape.calArea(); // invoked Square class calArea()
		shape.show();
		
		shape=new Rectangle();
		
		shape.calArea(); // invoked Rectangle class calArea()
		shape.show();
		
		
		
		
		

	}

}
