import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTryWithResource {

    public static void main(String[] args) {

        //This construcotr will append data not replace old data
        try (FileOutputStream f =
                new FileOutputStream("MyFile.txt" , true)){
            //4 will be save as binary form in the file
            f.write(4);

        } catch (FileNotFoundException e) {
            System.out.println("File not Found Error");
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}
