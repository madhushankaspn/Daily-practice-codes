class Demo{
	public static void myMethod(){
		System.out.println("mymethod1");
	}
}
class Example{
	public static void myMethod(){
		System.out.println("mymethod");
	}
	public static void main(String args[]){
	myMethod();
	Demo.myMethod();
	}
} 