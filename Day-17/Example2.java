class Box {
   int length;
   int width;
   int height;


   Box(int length, int width, int height) {
       this.length = length;
       this.width = width;
       this.height = height;
       System.out.println("parameterized Constructor");
   }


   public void printVolume() {
       int volume;
       volume = length * width * height;
       System.out.println("volume : " + volume);
   }
}


public class Example2 {
   public static void main(String[] args) {
       Box box = new Box(12,5,3);
       box.printVolume();
       //============
       System.out.println(box.length);
       System.out.println(box.width);
       System.out.println(box.height);
   }
}
