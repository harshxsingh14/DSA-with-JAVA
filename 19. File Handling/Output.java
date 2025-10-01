import java.io.*;

class Output {
    static void output() {
        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("hello there\n");
            osw.write(97);   
            osw.write(10);   
            osw.write('\n');
            char[] arr = "if it works ".toCharArray();
            osw.write(arr);
            osw.flush(); // make sure it's printed to console
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileWriter fw = new FileWriter("note.txt", true)) {
            fw.write("this should be appended\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt", true))) {
            bw.write("Jai shree Ram\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        output();
    }
}
