import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {

        try(FileInputStream f = new FileInputStream("abc.txt");
                FileOutputStream o = new FileOutputStream("copy.txt" )){

            int data;
            while ((data = f.read()) != -1){
                o.write(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
