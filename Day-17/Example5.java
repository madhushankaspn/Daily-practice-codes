class Value{
    int a;
    Value(int a){this.a=a;}
}
class ChangeValue{
    public static void incrementValue(int a){
        a++;
    }
}
class Example5{
    public static void main(String[] args) {
        Value v1 = new Value(100);
        System.out.println("Value is "+v1.a);//100
        ChangeValue.incrementValue(v1.a);
        System.out.println("Value is "+v1.a);//? --->  100
    }
}
