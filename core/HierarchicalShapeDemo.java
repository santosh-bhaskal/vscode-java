public class HierarchicalShapeDemo {
    static class Shape {
        String shapeType;

        Shape(String shapeType) {
            this.shapeType = shapeType;
        }

        void displayShapeType() {
            System.out.println("Shape Type  : " + shapeType);
        }
    }

    static class Circle extends Shape {
        double radius;

        Circle(double radius) {
            super("Circle");
            this.radius = radius;
        }

        void calculateAndDisplayArea() {
            displayShapeType();
            double area = Math.PI * radius * radius;
            System.out.println("Radius      : " + radius);
            System.out.printf("Area        : %.2f sq. units\n", area);
            System.out.println("---------------------------------------------");
        }
    }

    static class Rectangle extends Shape {
        double length;
        double breadth;

        Rectangle(double length, double breadth) {
            super("Rectangle");
            this.length = length;
            this.breadth = breadth;
        }

        void calculateAndDisplayArea() {
            displayShapeType();
            double area = length * breadth;
            System.out.println("Length      : " + length);
            System.out.println("Breadth     : " + breadth);
            System.out.println("Area        : " + area + " sq. units");
            System.out.println("---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("================ Hierarchical Inheritance (Shape -> Circle & Rectangle) ================");

        System.out.println("================= Circle Calculation =================");
        Circle c = new Circle(7.0);
        c.calculateAndDisplayArea();

        System.out.println("================ Rectangle Calculation ================");
        Rectangle r = new Rectangle(12.0, 6.0);
        r.calculateAndDisplayArea();
    }
}
