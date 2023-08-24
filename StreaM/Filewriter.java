import java.io.FileWriter;

public class Filewriter {
    public static void main(String[] args) {
        String data = "Yash has a pet dog named Bruno.";

        try {
            FileWriter output = new FileWriter("output.txt");

            output.write(data);
            System.out.println("Data written to the file.");

            output.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
