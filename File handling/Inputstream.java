import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Inputstream {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("example.txt");
            int data = inputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
