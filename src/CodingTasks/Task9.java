package CodingTasks;
/*
Write a java program to find the second largest number in the array?
 */
public class Task9 {
    public static void main(String[] args) {

        int [] numbers = {10, 15, 5, 7, 18, 12};

        int largestNum = 0;
        int secondLargestNum = 0;

        for (int num : numbers) {
            if(num > largestNum){
                secondLargestNum = largestNum;
                largestNum=num;
            }else if(num > secondLargestNum){
                secondLargestNum = num;
            }
        }
        System.out.println("The Second Largest Number in the Array is "+secondLargestNum);
    }


}

