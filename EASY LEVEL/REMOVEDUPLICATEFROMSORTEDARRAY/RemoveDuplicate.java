public class RemoveDuplicate{
    public static int removeDuplicate(int[] nums){
        if(nums.length == 0) return 0;
        int i =0;
        for(int j =0; j< nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int arr = removeDuplicate(nums);
        for (int i = 0; i < arr; i++) {
        System.out.println(nums[i]);
        }
    }
}