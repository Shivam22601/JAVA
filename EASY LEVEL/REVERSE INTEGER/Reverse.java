import java.util.Scanner;

public class Reverse {

    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit;
            x = x / 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = sc.nextInt();

        Reverse obj = new Reverse();
        int result = obj.reverse(x);

        System.out.println("Reversed number: " + result);
    }
}