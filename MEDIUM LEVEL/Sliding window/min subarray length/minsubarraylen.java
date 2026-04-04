public class minsubarraylen{
    public int minsubarraylen(int target, int[] nums){
        int n = nums.length;
        int minlength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for(int right = 0; right < n; right++){
            sum += nums[right];

            while(sum >= target){
                minlength = Math.min(minlength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
    return minlength == Integer.MAX_VALUE ? 0 : minlength;
    }


    public static void main (String[] args){
        minsubarraylen solution = new minsubarraylen();
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int result = solution.minsubarraylen(target, nums);
        System.out.println("Minimum subarray length: " + result);
    }
}