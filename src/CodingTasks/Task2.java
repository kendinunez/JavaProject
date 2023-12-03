package CodingTasks;
/*
Create an array of integer values.
After the array is created, calculate the
sum of all stored elements in that array.
 */
public class Task2 {
    public static void main(String[] args) {

        int [] numbers = {5, 10, 15, 20, 25, 30};

        int sum = 0;
        for (int num : numbers){
            sum=sum+num;
        }
        System.out.println("The sum of all the numbers in the array is "+sum);
    }
}
