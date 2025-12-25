class A{
	int a;
	
	A(){
		System.out.println("Constructor");
		a=100;
	}
	{
		System.out.println("Instance block");
		a=10;
	}
	
}
class Example4{
	public static void main(String [] args){
		A a1=new A();
		System.out.println("A: "+a1.a);
	}
}	