package CodingTasks;
/*
Write a Java Program to print the first 10 numbers of Fibonacci series.
 */
public class Task7 {
    public static void main(String[] args) {

        System.out.println("First 10 numbers of Fibonacci series are: ");

        int n = 10;
        int[] fibonacciSeries = new int[n];

        fibonacciSeries[0]=0;
        fibonacciSeries[1]=1;

        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1]+ fibonacciSeries[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries[i]+" ");
        }

    }
}
