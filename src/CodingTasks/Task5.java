package CodingTasks;
/*
Write a program to swap 2 numbers without a temporary variable
 */
public class Task5 {
    public static void main(String[] args) {

        int[] numbers = {1, 5};

        numbers[0] = numbers[0] + numbers[1];
        numbers[1] = numbers[0] - numbers[1];
        numbers[0] = numbers[0] - numbers[1];

        System.out.println(numbers[0]+" "+numbers[1]);


    }
}
