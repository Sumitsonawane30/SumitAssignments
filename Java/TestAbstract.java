//abstract Method in java
abstract class shape{
	abstract void draw();
}

class Rectangle extends shape{
	void draw(){
		System.out.println("Shape is an Rectangle");
	}
}
class Circle extends shape{
	void draw(){
		System.out.println("Shape is an Circle");
	}
}

class TestAbstract{
	public static void main (String args[]){
		shape s=new Rectangle();
		s.draw();
	}
}