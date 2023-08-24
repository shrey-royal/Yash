import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Objectinput {
    public static void main(String[] args) {
        int data1 = 5;
        String data2 = "This is a string";

        try {
            //writing to a file
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("output.txt"));

            out.writeInt(data1);
            out.writeObject(data2);
            out.close();

            //reading from the same file that we just wrote to
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.txt"));
            System.out.println("Integer: " + in.readInt());
            System.out.println("String: " + in.readObject());
            in.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
