import java.util.Scanner;
public class PowerOfFour{
    public boolean isPowerOfFour(int n){
        if(n < 0) return false;
        while(n % 4 == 0){
            n = n / 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        PowerOfFour powerOfFour = new PowerOfFour();
        System.out.println("enter the power of four"); // true
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = powerOfFour.isPowerOfFour(n);
        System.out.println(result);
    }
}