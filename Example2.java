class Box {
    int length;
    int width;
    int height;

    public void setSize(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    public void printVolume() {
        int volume = length * width * height;
        System.out.println("Volume of the box : " + volume);
    }

    public void printArea() {
        int area = 2 * length * width + 2 * length * height + 2 * width * height;
        System.out.println("Area of the box : " + area);
    }
}

public class Example2 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setSize(10, 5, 2);
        b1.printVolume();
        b1.printArea();
    }
}

	/* public void setLenght(int l){
		lenght = l;
	}
	public void setWidht(int w){
		widht = w;
	}
	public void setHeight(height h){
		height = h;
	}  */ 	
		
	