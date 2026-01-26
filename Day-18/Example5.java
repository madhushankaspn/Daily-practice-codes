class Example5 {

    // instance method
    public void instanceMethod() {
        System.out.println("instanceMethod");
    }

    // static method
    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    public static void main(String[] args) {

        // calling static method (correct way)
        Example5.staticMethod();

        // creating object to call instance method
        Example5 d1 = new Example5();
        d1.instanceMethod();
    }
}
