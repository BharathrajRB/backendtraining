import java.io.*;

public class BufferedInput {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("example.txt");

            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            int data = bufferedInputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = bufferedInputStream.read();
            }
            bufferedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
