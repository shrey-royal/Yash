import java.io.FileOutputStream;

public class FileOutputstream {
    public static void main(String[] args) {

        FileOutputStream fos = null;

        String data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        
        try {
            fos = new FileOutputStream("output.txt");

            //Converts the string into bytes
            fos.write(data.getBytes());

            // byte[] array = data.getBytes();

            //Using flush() method
            fos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
Methods of FileOutputStream:
The FileOutputStream class provides implementations for different methods present in the OutputStream class.

write() Method
write() - writes the single byte to the file output stream
write(byte[] array) - writes the bytes from the specified array to the output stream
write(byte[] array, int start, int length) - writes the number of bytes equal to length to the output stream from an array starting from the position start

*/