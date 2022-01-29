import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTryWithResource {

    public static void main(String[] args) {

        //Try with resource will close stream connection automatically.
        try (FileInputStream f  =
                     new FileInputStream("abc.txt")) {

            //file input stream read data in binary( 0 or 1 ) form (one byte at a time)
            //therefore return  type is int and do type casting for see actual data
            //he have to use loop to read complete data
            int data;
            while((data = f.read()) != -1){ // if not data found read mehtod will return -1 (end of file)
                System.out.println(data);
                //type casting to read actual data.
                System.out.println("Actual data value = " + (char)data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found error");
        } catch (IOException e) {
            System.out.println("IO  error");
        }
    }
}
