import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Bufferedoutput {
    public static void main(String[] args) {
        String input = "This is a Yashvi";

        try {
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("output.txt"));
            
            byte[] b = input.getBytes();

            out.write(b);
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
