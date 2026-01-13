class value{
    int a;

    value(int a){

        this.a=a;
    }
}

class changeValue{
    public static void incrementValue(int a){
        a++;
    }
    public static void incrementValue(value v){
        v.a++;
    }
}
public class Example{
    public static void main (String[] args){
        value v1=new value(100);
        System.out.println(v1.a);
        changeValue.incrementValue(v1.a);
        System.out.println(v1.a);
        changeValue.incrementValue(v1);
        System.out.println(v1.a);
    }

}