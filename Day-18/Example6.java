import java.sql.SQLOutput;

class Example6 {
    int x=100;
    static int y=200;

    Example6(){
        System.out.println("Constructor");
    }

    static{
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance Block");
    }
    public void instanceMethod(){
        System.out.println("Instance Method");
    }
    public static void staticMethod(){
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        Example6 m1=new Example6();
        Example6 m2=new Example6();

    }

}
