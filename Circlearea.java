class Circle{
    double radius;

    double calculateArea(){
        return Math.PI * radius * radius;
    }

    double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
public class Circlearea {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 3.5;
        double Area = c1.calculateArea();
        double perimeter = c1.calculatePerimeter();
        System.out.println("Radius is " + c1.radius);
        System.out.printf("Area is %.2f\n", Area);
        System.out.printf("Perimeter is %.2f\n", perimeter);

    }
}
