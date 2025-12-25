/*class A{
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
}*/	

class A{
   int a;


   A(){
       a=100;
   }
   {
       a=10;
   }
   A(int i){
   }


}


/*
* class A{
   int a;


   A(){
       a=10;
       a=100;
   }
   {


   }
   A(int i){
   * a=10;
   }


}
*
*
* */


class Example{
   public static void main(String[] args){
       A a1=new A();
       System.out.println("A:"+a1.a); //100


       A a2=new A(1);
       System.out.println("A:"+a2.a); //10
   }
}
