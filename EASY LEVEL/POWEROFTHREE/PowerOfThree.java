import java.util.Scanner;
public class PowerOfThree{
    public boolean isPowerOfThree(int n){
        if(n <= 0){
            return false;
        }
        while(n %  3 == 0)
        {
            n /= 3;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        PowerOfThree solution = new PowerOfThree();
        System.out.println("enter a power of three: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = solution.isPowerOfThree(n);
        System.out.println("is " + n + " a power of three? " + result);
    }
}