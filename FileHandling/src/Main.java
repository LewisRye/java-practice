import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileOps f = new FileOps();
        Scanner sc = new Scanner(System.in);

        System.out.println("A file will be created, edited and then deleted.");
        System.out.print("What would you like to write on the txt file?: ");
        String message = sc.nextLine();
        f.createFile();
        f.editFile(message);
        f.readFile();
        f.deleteFile();
        System.out.println("File handling complete!");
    }
}