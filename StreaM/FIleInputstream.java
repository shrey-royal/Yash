import java.io.FileInputStream;
import java.io.InputStream;

public class FIleInputstream {
    // public static void main(String[] args) {
    //     byte[] array = new byte[100];

    //     try {
    //         InputStream input = new FileInputStream("input.txt");

    //         System.out.println("Available bytes in the file: " + input.available());

    //         //Read byte from the input stream
    //         input.read(array);
    //         System.out.println("Data read from the file: ");

    //         //Convert byte array into string
    //         String data = new String(array);
    //         System.out.println(data);

    //         //Close the input stream
    //         input.close();
    //     } catch (Exception e) {
    //         System.out.println(e);
    //     }
    //     System.out.println("End of program");
    // }
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.txt");

            System.out.println("File size: " + fis.available() + " bytes");

            System.out.println("Data in the file: ");

            //Reads the first byte
            int i = fis.read();
            System.out.println("File size: " + fis.available() + " bytes");


            while (i != -1) {
                System.out.print((char) i);

                //Reads next byte from the file
                i = fis.read();
            }
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*

Methods:

The InputStream class provides different methods that are implemented by its subclasses. Here are some of the commonly used methods:

read() - reads one byte of data from the input stream
read(byte[] array) - reads bytes from the stream and stores in the specified array
available() - returns the number of bytes available in the input stream
mark() - marks the position in the input stream up to which data has been read
reset() - returns the control to the point in the stream where the mark was set
markSupported() - checks if the mark() and reset() method is supported in the stream
skips() - skips and discards the specified number of bytes from the input stream
close() - closes the input stream






*/