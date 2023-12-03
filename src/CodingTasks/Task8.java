package CodingTasks;
/*
Maximum and minimum number in the array
 */
public class Task8 {
    public static void main(String[] args) {

        int [] nums = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

        int min=nums[0];
        int max=nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>max){
                max = nums[i];
            }else if(nums[i]<min){
                min = nums[i];
            }
        }
        System.out.println("Minimum number is "+min);
        System.out.println("Maximum number is "+max);
    }
}
