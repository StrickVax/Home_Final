package Home_Final;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

    protected void filePrinter(String professional, String date, String time, int rooms, double cost) {

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
