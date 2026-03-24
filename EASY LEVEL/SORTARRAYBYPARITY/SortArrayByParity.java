public class SortArrayByParity{
    public int[] SortArrayByParity(int[] nums){{
        int[] result = new int[nums.length];
        int index = 0;

        for(int i=0; i< nums.length ; i++){
            if(nums[i] % 2 == 0){
                result[index++] = nums[i];
            }
        }

        for(int i=0; i< nums.length ; i++){
            if(nums[i] % 2 != 0){
                result[index++] = nums[i];
            }
        }
        return result;
    }}

    public static void main(String[] args) {
        SortArrayByParity SAP = new SortArrayByParity();
        int[] nums = {1,2,3,4,5,6};
        int[] result= SAP.SortArrayByParity(nums);
        for(int i = 0; i<result.length ; i++){
            System.out.println(result[i] + " ");
        }
    }
}