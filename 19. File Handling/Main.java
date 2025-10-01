import java.io.*;
import java.io.IOException;

class Main {
  public static void main(String[] args) {

    // create
    try {
      File fo = new File("file.txt");
      fo.createNewFile();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    // write in the file
    try {
      FileWriter fw = new FileWriter("file.txt");
      fw.write("One Piece is the greatest piece of fiction");
      fw.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    // reading from a file
    try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
      while (br.ready()) {
        System.out.println(br.readLine());
      }
    } catch (IOException e) {
        System.out.println(e.getMessage());      
    }

    try {
      File fo = new File("random.txt");
      fo.createNewFile();
      if(fo.delete()) {
        System.out.println(fo.getName());
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    
    
  }
}