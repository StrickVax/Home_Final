package Home_Final;

// Package imports
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

    protected void filePrinter(String professional, String date, String time, int rooms, double cost) {

        // Creates a .txt with the profession's name. It then outputs the user's selections
        try {
            FileWriter myWriter = new FileWriter(professional + "_Appointment.txt");
            myWriter.write(
                    professional + "\n"
                            + date + "\n"
                            + time + "\n"
                            + rooms + " rooms \n"
                            + "$" + cost + "\n");
            myWriter.close();
        } catch (IOException exc) {
            System.out.println("An error occurred");
        }
    }
}
