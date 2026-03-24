import java.util.Scanner;
public class FibonacciNumber{
    public int fib(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n-1) + fib(n - 2);
    }
    public static void main(String[] args){
        FibonacciNumber fn =new FibonacciNumber();
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The " + n + "th Fibonacci number is: " + fn.fib(n));
    }
}