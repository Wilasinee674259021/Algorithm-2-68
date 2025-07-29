import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double triangleArea = 0.5 * base * height;
        System.out.println("Area of the triangle: " + triangleArea + " square units");

        System.out.println("\n------------------------------\n");

        
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double rectangleArea = length * width;
        System.out.println("Area of the rectangle: " + rectangleArea + " square units");

        scanner.close();
    }
}
