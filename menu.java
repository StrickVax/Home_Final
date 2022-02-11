package Home_Final;

import java.util.Scanner;

public class menu {
    protected String a;
    protected String b;
    protected String c;
    protected String d;
    protected String f;

    protected void displayOptions() {
        System.out.println();
        System.out.println("Quit -- (0)");
    }

    protected void displayMenu() {
        int flag = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n\n\nWelcome to the Home Improvement Menu");
            System.out.println("What would you like to do?\n");

            displayOptions();

            flag = in.nextInt();
        } while (flag != 0);
        in.close();
    }
}
