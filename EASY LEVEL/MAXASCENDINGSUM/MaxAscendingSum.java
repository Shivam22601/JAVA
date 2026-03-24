import java.util.Scanner;
public class MaxAscendingSum{
    public int maxAscendingSum(int[] nums){
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                currSum += nums[i];
            }else{
                currSum = nums[i];
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String args[]){
        MaxAscendingSum asc = new MaxAscendingSum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n  = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] nums = new int[n];
        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int result = asc.maxAscendingSum(nums);
        System.out.println("The maximum ascending sum is: " + result);
    }
}