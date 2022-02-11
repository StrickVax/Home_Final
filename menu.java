package Home_Final;

import java.util.Scanner;

public class menu {
    protected String a;
    protected String b;
    protected String c;
    protected String d;
    protected String f;

    // Outputs the user's options
    protected void displayOptions() {
        System.out.println();
        System.out.println("Quit -- (0)");

        System.out.println("Painters -- (1)");
        System.out.println("Remodelers -- (2)");
        System.out.println("Constructors -- (3)");
        System.out.println("Designers -- (4)");
        System.out.println("Electricians -- (5)");
    }

    protected void displayMonths() {

        // scan's the user's selection with key
        // rather inefficient way to assign months, but it does showcase a switch case
        String key = scan.nextLine();
        System.out.println("\nSelect a month");
        switch (key) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
            case 12:

                break;
            default:
                System.out.println("Error: Invalid month");
                break;
        }
    }

    protected void displayMenu() {
        // Sets the flag to zero
        int flag = 0;

        // declares the variables needed to print the summary file.

        int profession, month, day, hours, rooms;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n\n\nWelcome to the Home Improvement Menu");
            System.out.println("What would you like to do?\n");

            // Asks the user what they wish to do, and lists their options
            displayOptions();

            flag = in.nextInt();
            if (0 < flag && flag < 6) {
                profession = flag;
                displayMonths();
            }
        } while (flag != 0);
        in.close();
    }
}
