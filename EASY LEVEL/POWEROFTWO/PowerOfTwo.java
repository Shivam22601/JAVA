import java.util.Scanner;
public class PowerOfTwo{
    public boolean isPowerOfTwo(int n){
        if(n <= 0){
            return false;
        }
        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        PowerOfTwo solution = new PowerOfTwo();
        System.out.println("enter a power of two: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = solution.isPowerOfTwo(n);
        System.out.println("is " + n + " a power of two? " + result);
    }
}