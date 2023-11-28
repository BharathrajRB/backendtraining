import java.io.ByteArrayInputStream;
import java.io.IOException;

public class byteInput {
    public static void main(String[] args) {
        String text = "ByteArrayInputStream!";
        byte[] byteArray = text.getBytes();
        // Convert the string to byte array

        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray)) {
            int data = byteArrayInputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = byteArrayInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
