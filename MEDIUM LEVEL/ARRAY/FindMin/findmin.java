public class findmin{
    public int findmin(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int num[] = {5, 2, 9, 1, 5, 6};
        findmin fm = new findmin();
        int minValue = fm.findmin(num);
        System.out.println("The minimum value in the array is: " + minValue);
        
    }
}