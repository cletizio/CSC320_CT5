import java.util.ArrayList;
import java.util.Scanner;
public class weather {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Declare global variables
        final int daysInWeek = 7;
        ArrayList<String> dayOfWeek = new ArrayList<>();
        ArrayList<Double> averageTemp = new ArrayList<>();

        //Get user input for days and temps and add to the proper ArrayLists
        for (int i = 0; i < daysInWeek; ++i) {
            System.out.print("Enter the day of the week: ");
            dayOfWeek.add(scnr.next());

            System.out.print("Enter the average temperature: ");
            averageTemp.add(scnr.nextDouble());
        }
        // Get user input for weekly average or no
        System.out.print("Type \"week\" to print the weekly average temperature. " +
                "Type anything else to display temps: ");
        String calcAverage = scnr.next();
        calcAverage = calcAverage.toLowerCase();

        // Calculate weekly average
        if (calcAverage.equals("week")) {
            double weeklySum = 0.0;
            for (double temp : averageTemp) {
                weeklySum += temp;
            }
            double weeklyAverage = weeklySum / averageTemp.size();
            for (int i = 0; i < dayOfWeek.size(); i++) {
                System.out.println("Day: " + dayOfWeek.get(i) + " Temp: " + averageTemp.get(i));
            }
            System.out.println("Average temperature for the week is: " + weeklyAverage);
        }

        // Weekly average not needed
        else {
            for (int i = 0; i < dayOfWeek.size(); i++) {
                System.out.println("Day: " + dayOfWeek.get(i) + " Temp: " + averageTemp.get(i));
            }
        }
    }
}