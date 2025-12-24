class A{
   int a=10;
   int b=20;


   A(){
       a=100;
   }
   A(int i){
       a=i;
   }
   A(int i,int j){
   }


}
/*
* class A{
   int a;
   int b;


   A(){
       a=10;
       b=20;
       a=100;
   }
   A(int i){
       a=10;
       b=20;
       a=i;
   }
   A(int i,int j){
       a=10;
       b=20;
   }


}
* */


class Example3{
   public static void main(String[] args){
       A a1=new A();
       System.out.println(a1.a+" "+a1.b);// 100 20


       A a2=new A(200);
       System.out.println(a2.a+" "+a2.b); // 200 20


       A a3=new A(200,300);
       System.out.println(a3.a+" "+a3.b); // 10 20
   }
}
