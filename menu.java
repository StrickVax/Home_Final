package Home_Final;

import java.time.Month;
import java.util.Scanner;

public class menu {

    protected void displayMenu() {

        // Sets the flag to zero
        int flag;
        // declares the variables needed to print the summary file.
        int profession, day, hours, rooms;

        Scanner in = new Scanner(System.in);

        do {
            flag = 0;
            System.out.println("\n\nWelcome to the Home Improvement Menu");
            System.out.println("What would you like to do?\n");

            // Asks the user what they wish to do, and lists their options
            displayProfessions();

            flag = in.nextInt();

            // Looks to see if the user inputted a valid option.
            if (0 < flag && flag < 6) {
                profession = flag;
                displayMonths();
            } else if (flag != 0) {
                System.out.println("ERROR -- \'" + flag + "\' is invalid");
            }
        } while (flag != 0);
        in.close();
    }

    // Outputs the list of professions
    protected void displayProfessions() {
        System.out.println();
        System.out.println("Quit\t\t(0)");
        System.out.println("Painters\t(1)");
        System.out.println("Remodelers\t(2)");
        System.out.println("Constructors\t(3)");
        System.out.println("Designers\t(4)");
        System.out.println("Electricians\t(5)");
    }

    protected void displayMonths() {
        int month;
        String monthName;

        Scanner in = new Scanner(System.in);
        // scan's the user's selection with key
        // rather inefficient way to assign months, but it does showcase a switch case
        System.out.println("\nType the number of the month (1-12):");
        month = in.nextInt();

        switch (month) {
            case 1:
                monthName = ("Jan");
                break;
            case 2:
                monthName = ("Feb");
                break;
            case 3:
                monthName = ("Mar");
                break;
            case 4:
                monthName = ("Apr");
                break;
            case 5:
                monthName = ("May");
                break;
            case 6:
                monthName = ("Jun");
                break;
            case 7:
                monthName = ("Jul");
                break;
            case 8:
                monthName = ("Aud");
                break;
            case 9:
                monthName = ("Sept");
                break;
            case 10:
                monthName = ("Oct");
                break;
            case 11:
                monthName = ("Nov");
                break;
            case 12:
                monthName = ("Dec");
                break;
            default:
                monthName = ("Error -- Invalid month");
                break;
        }

        System.out.println(monthName);
        
        // Only lets user confinue if month is valid
        if (month > 0 && month < 12) {
            displayDay();
        }
    }

    protected void displayRooms() {
        int rooms;
        System.out.println("Enter number of rooms you wish to work on");
        Scanner in = new Scanner(System.in);

        rooms = in.nextInt();
        if (rooms > 0) {
            int numberOfRooms[] = new int[rooms];
            confirmation();
        }
        in.close();
    }

    protected void displayDay() {
        int day;
        System.out.println("Enter day of the month");
        Scanner in = new Scanner(System.in);

        day = in.nextInt();
        if (day < 32 && day > 0)
            displayRooms();
    }

    protected void confirmation() {
        int flag = 0;
        System.out.println("Are these your choices");
        System.out.println("[Display choices]");
        System.out.println("(1) -- Y\n (0) -- N");
        Scanner in = new Scanner(System.in);

        flag = in.nextInt();
        if (flag == 1) {
            // Call fileWriter
        }
        in.close();
    }
}
