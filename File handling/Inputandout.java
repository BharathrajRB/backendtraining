import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Inputandout {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            FileInputStream input = new FileInputStream(inputFile);
            FileOutputStream output = new FileOutputStream(outputFile);
          //  output.flush();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            input.close();
            output.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
