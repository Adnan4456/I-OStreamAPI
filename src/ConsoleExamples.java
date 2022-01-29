import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class ConsoleExamples {

    public static void main(String[] args) throws IOException {

        Console console;
        LocalDateTime currentDateTime = LocalDateTime.now();

        //Represent name typed in by user
        String name;

        //if console may be null , for example within the IntelliJ IDE
        if ((console = System.console())!= null){

            //Console support a simple printf statement
            console.printf("Interacting with user via concole\n");

            //Console reads a line of text, terminated by the enter key.
            name = console.readLine("What is your name");

            //Alernate of printf , use the console.writer().println
            console.writer().println("Your name input : " + name);
            console.format("The local date and time is : " +
                        "%1$tF %1$tr", currentDateTime);
        }
        else {
            //Getting the same data using standard in and out
            System.out.println("Interacting with user via standard input / output:");
            System.out.println("What is your name  ? ");

            //Read in text using carriage return with BufferedReader
            BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
            name = reader.readLine();

            //output the name
            System.out.println("Your input name  = " + name);
            System.out.println(String.format("The local date and time is :"
            +  "%1$tF %1$tr " , currentDateTime));
        }
    }
}
