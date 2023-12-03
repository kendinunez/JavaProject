package CodingTasks;
/*
Create a 2D array or integer type where you will store odd and even numbers.
Develop a program which will identify/print the even numbers
only.
 */
public class Task3 {
    public static void main(String[] args) {

        int[][] nums = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println("The even numbers in the 2D Array are: ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j]%2==0){
                    System.out.print(nums[i][j]+" ");
                }
            }
        }
    }
}

