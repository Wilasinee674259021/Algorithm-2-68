import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        System.out.print("Enter salary ");
        Scanner scanner = new Scanner(System.in);
        float salary = scanner.nextFloat();
        float tax = salary * 0.10f;
        float netSalary = salary - tax;
        System.out.println("Tax: " + tax);
        System.out.println("Net salary after tax: " + netSalary);
    }
}
