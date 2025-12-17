class Box{
	int length;
	int width;
	int height;
	
	public void setSize(int length,int width, int height){
		this.length = length;
		this.width=width;
		this.height=height;
		
	}

	public void printValues(){
		System.out.println("Length : "+length);
		System.out.println("width : "+width);
		System.out.println("height : "+height);
	}
}	
class Example4{
	public static void main(String [] args){
		Box b1 = new Box();
		b1.setSize(12,5,2);
		b1.printValues();
		
	}
}	