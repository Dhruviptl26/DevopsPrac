import java.util.*;

public class AddSub {

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;  // safe return value
        }
        return a / b;
    }
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        

        int mul = mul(a, b);
        System.out.println("Multiplication = " + mul);

        int div = div(a, b);
        System.out.println("Division = " + div);

        sc.close();
    }
}
