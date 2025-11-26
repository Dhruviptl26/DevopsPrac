import java.util.*;
public class AddSub {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        int div;
        if(b==0){
            System.out.println("div by zero");
            return 0;
        }
        else{
            div=a/b;
            return div;
        }
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
            int mul=mul(a,b);
            System.out.println("Mul= "+mul);
            int div=div(a,b);
            System.out.println("div="+div);
            sc.close();
        }
    }
    