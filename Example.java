public class Example {
    public static void main(String[] args) {

        int length;
        int height;
        int width;

        length = 12;
        width = 5;
        height = 3;

        int volume;
        volume = length * height * width;
        System.out.println(volume);

        int area;
        area = 2 * length * width + 2 * length * height + 2 * width * height;
        System.out.println(area);
    }
}
