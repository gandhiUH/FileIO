import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
      Scanner input= new Scanner(System.in);
        PrintWriter outfile= new PrintWriter("names.txt");
        System.out.println("Enter a name: ");
        String name=input.next();
        outfile.println(name);
        outfile.close();

    }
}
