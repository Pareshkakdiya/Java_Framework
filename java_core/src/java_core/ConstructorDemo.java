package java_core;



class Box{
	private double height,width,depth;
	
    public Box() {
		height = 10;
		width = 20;
		depth = 30;
		System.out.println("default consturctor called!!");
	}
	
	public Box(double h,double w, double d) {
		height=h;
		width=w;
		depth=d;
		System.out.println("parameterized construrctor called!!");
		}
	
	public Box(Box b) {
		System.out.println("copy constructor called!!");
		height = b.height;
		width = b.width;
		depth = b.depth;
	}
	
	void volumeBox() {
		System.out.println("volume"+(height*width*depth));
	}
}
	

public class ConstructorDemo {
	public static void main(String[] args) {
//		Box dc = new Box();
//		Box pc = new Box(1,2,3);
//		Box cc = new Box(dc);
//		dc.volumeBox();
//		pc.volumeBox();
//		cc.volumeBox();
		
		new Box();
		new Box(10,20,30);
	}

}
