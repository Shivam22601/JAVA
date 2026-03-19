import java.util.Scanner;
public class climbStairs{
    public int climbStairs(int n){
        int[] dp = new int[n + 1];
        return solve(n, dp);
    }

    private int solve(int n, int[] dp){
        if(n  == 1) return 1;
        if( n == 2) return 2;

        if(dp[n] != 0) return dp[n];

        dp[n] = solve(n - 1, dp) + solve(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        climbStairs cs = new climbStairs();
        System.out.println("enter number of stairs");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("number of ways to climb stairs: " + cs.climbStairs(n));
    }
}