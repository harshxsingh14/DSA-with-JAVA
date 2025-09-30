import java.io.*;

class Output {
    static void output() {
    OutputStream os = System.out;

    try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
      osw.write("hello there");
      osw.write(97);
      osw.write(10);
      osw.write('A');
      osw.write('\n');
      char[] arr = "if it works ".toCharArray();
      osw.write(arr);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    try (FileWriter fw = new FileWriter("note.txt", true)) {
      fw.write("this should be appended");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))) {
      bw.write("Jai shree Ram");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    }
}