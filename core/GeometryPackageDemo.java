import geometry.Circle;
import geometry.Rectangle;

public class GeometryPackageDemo {
    public static void main(String[] args) {
        System.out.println("================ Demonstration of User-Defined Package: geometry ================");

        System.out.println("================= Circle Area Calculation =================");
        Circle c = new Circle(7.0);
        System.out.printf("Area of Circle with radius 7.0 : %.2f sq. units\n", c.calculateArea());

        System.out.println("\n================ Rectangle Area Calculation ================");
        Rectangle r = new Rectangle(10.0, 5.0);
        System.out.println("Area of Rectangle (10.0 x 5.0) : " + r.calculateArea() + " sq. units");
        System.out.println("==================================================================================");
    }
}
