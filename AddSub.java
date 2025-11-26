import java.util.*;
public class AddSub {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int sub(int a, int b) {
        return a - b;
    }
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
    
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
    
            int sum = add(a, b);
            System.out.println("Addition = " + sum);
    
            int diff = sub(a, b);
            System.out.println("Subtraction = " + diff);
    
            sc.close();
        }
    }
    