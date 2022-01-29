import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleInput {

    public static void main(String[] args) {

        //must pass file name from command line.
        // read file must exist physically
        //For write if file not exist then it will create that file.

        //run time file name with console
        //one space b/w two files name
        try(FileInputStream f = new FileInputStream(args[0]);
            FileOutputStream o = new FileOutputStream(args[1] )){

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
