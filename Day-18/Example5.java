class Example5{
    public void instanceMethod () {
        System.out.println("instanceMethod");
    }


    public static void staticMethod () {

        System.out.println("staticMethod");
    }

    public static void main(String[] args) {

        staticMethod();//ok
        Example5.staticMethod();//ok
        //instanceMethod(); //Error
        //Demo.instanceMethod(); //Error

        Example5 d1=new Example5();
        d1.instanceMethod();



    }
}