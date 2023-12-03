package CodingTasks;
/*
Write a program to print out duplicate elements from an Array of Strings
 */
public class Task10 {
    public static void main(String[] args) {

        String [] names = {"Kendi", "Kimmy", "Keyli", "Kendi", "Kendi"};
        System.out.println();
        System.out.println("The Duplicate Elements from the Array are: ");

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if(names[i].equals(names[j])){
                    System.out.print(names[i]+" ");
                }
            }
        }
        System.out.println();
    }
}
