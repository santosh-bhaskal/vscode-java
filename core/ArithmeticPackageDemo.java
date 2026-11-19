import arithmetic.Calculator;

public class ArithmeticPackageDemo {
    public static void main(String[] args) {
        System.out.println("================ Demonstration of User-Defined Package: arithmetic ================");
        
        Calculator calc = new Calculator();
        double a = 24.0;
        double b = 6.0;

        System.out.println("Operand 1 : " + a);
        System.out.println("Operand 2 : " + b);
        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("Addition       (" + a + " + " + b + ") : " + calc.add(a, b));
        System.out.println("Subtraction    (" + a + " - " + b + ") : " + calc.subtract(a, b));
        System.out.println("Multiplication (" + a + " * " + b + ") : " + calc.multiply(a, b));
        System.out.println("Division       (" + a + " / " + b + ") : " + calc.divide(a, b));
        System.out.println("==================================================================================");
    }
}
