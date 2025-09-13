class Example {
    // Method that takes a double and returns a boolean
    public static boolean myMethod(double b) {
        System.out.println("abc");
        return true;
    }

    // Method that takes an int and returns a double
    public static double myMethod(int b) {
        System.out.println("xyz");
        return 10.2;
    }

    public static void main(String[] args) {
        
        boolean d = myMethod(10.2);
        myMethod(10);

            }
}
