import java.io.FileReader;
import java.io.IOException;

public class SimpleFileReader {
    public static void main(String[] args) {
        String fileName = "a.txt";

        try (FileReader reader = new FileReader(fileName)) {
            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            System.out.printf("Exception occurred: %s", e.getMessage());
        }
    }
}
