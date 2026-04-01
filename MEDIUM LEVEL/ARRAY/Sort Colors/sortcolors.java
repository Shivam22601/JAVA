public class sortcolors{
    public void sortcolors(int[] nums){
        int Low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high){
           if(nums[mid] == 0) {
            int temp = nums[Low];
            nums[Low] = nums[mid];
            nums[mid] = temp;
            Low++;
            mid++;
           }
           else if(nums[mid] == 1){
            mid++;
           }
           else{
            int temp = nums[high];
            nums[high] = nums[mid];
            nums[mid] = temp;
            high--;
           }
        }

    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortcolors sc = new sortcolors();
        sc.sortcolors(nums);
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
}