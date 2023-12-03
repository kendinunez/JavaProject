package CodingTasks;
/*
Create a program that uses an array to store a list of temperatures for a week,
and then uses a loop to find the highest and lowest temperature for the week.
 */
public class Task1 {
    public static void main(String[] args) {

        int [] weeklyTemp = {77, 55, 56, 72, 63, 62, 71};
        int highTemp = weeklyTemp [0];
        int lowTemp = weeklyTemp [0];

        for (int i : weeklyTemp) {
            if(i > highTemp){
                highTemp = i;
            }
            if(i < lowTemp){
                lowTemp = i;
            }
        }
        System.out.println("Highest Temperature of the week was "+highTemp);
        System.out.println("Lowest Temperature of the week was "+lowTemp);

    }
}
