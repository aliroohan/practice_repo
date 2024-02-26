class Rectangle{
    double length;
    double width;

    double calculateArea(){
        return length * width;
    }

    double calculatePerimeter(){
        return 2 *(length + width);
    }
}
public class RectangleArea {
    public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.length = 4;
    r1.width = 2;
    System.out.println("Length is :" + r1.length);
    System.out.println("Width is :" + r1.width);
    System.out.printf("Area is : %.2f\n", r1.calculateArea());
    System.out.printf("Perimeter is : %.2f\n", r1.calculatePerimeter());

    }

}
