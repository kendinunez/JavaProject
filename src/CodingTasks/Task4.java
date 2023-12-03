package CodingTasks;

import java.util.Arrays;

/*
Create a 2D array of integers.
Develop a program which will calculate the sum of even and odd numbers
for that array.
 */
public class Task4 {
    public static void main(String[] args) {

        int [][] nums = {
                {11, 12, 13},
                {14, 15, 16},
                {17, 18, 19},
                {20, 21, 22},
                {23, 24, 25}
        };
        int sumEven=0;
        int sumOdd=0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j]%2==0){
                    sumEven=sumEven+nums[i][j];
                }else{
                    sumOdd=sumOdd+nums[i][j];
                }
            }
          }
        System.out.println("The sum of Even numbers is "+sumEven);
        System.out.println("The sum of Odd numbers is "+sumOdd);
        }
    }

