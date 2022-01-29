import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //if file is not present then compiler will create this file.No exception occur.
        //This constructor will replace old data with new data
        FileOutputStream f = new FileOutputStream("MyFile.txt");

        //data will save in binary form (0 or 1 ) into file.
        f.write(1);
        f.close();
    }
}
