import java.io.FileInputStream;

public class FileInput {

    public static void main(String[] args) throws Exception{

        FileInputStream  f = new FileInputStream("MyFile.txt");
        int data = f.read();
        System.out.println(data);
        f.close();
    }
}
