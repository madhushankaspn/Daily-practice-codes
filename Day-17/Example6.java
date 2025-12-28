  class A{
   public A getCopy(){
       //return this;
       /*A a1 = new A();
       return a1;*/
       return new A(); // anonymous Object
   }
}


class Example6{
   public static void main(String[] args) {
       A a = new A();
       A a2 = a.getCopy();


       System.out.println(a == a2);
   }
}
