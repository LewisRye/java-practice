import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.SecurityException;

public class FileOps {
    /**
     * Creates a simple file
     */
    protected void createFile() {
        try {
            File file = new File("File.txt"); // filepath is relative to the FileHandling folder...
            if (file.createNewFile()) {
                System.out.println("File created at " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists at " + file.getAbsolutePath());
            }
        } catch (IOException ex) {
            System.err.println(ex.getClass());
        }
    }

    /**
     * Overwrites a txt file with message param
     * @param message
     */
    protected void editFile(String message) {
        try {
            File file = new File("File.txt"); // filepath is relative to the FileHandling folder...
            if (file.exists()) {
                FileWriter writer = new FileWriter(file);
                writer.write(message);
                writer.close();
                System.out.println("File was successfully written to.");
            } else {
                System.err.println("File could not be found.");
            }
        } catch (IOException ex) {
            System.err.println(ex.getClass());
        }
    }

    /**
     * Reads all lines of a simple txt file
     */
    protected void readFile() {
        int characters;

        try {
            File file = new File("File.txt"); // filepath is relative to the FileHandling folder...
            if (file.exists()) {
                System.out.println("Contents of file:");
                FileReader reader = new FileReader(file);
                while ((characters = reader.read()) != -1) {
                    System.out.print((char) characters);
                }
                System.out.println();
                reader.close();
            } else {
                System.err.println("File could not be found.");
            }
        } catch (IOException ex) {
            System.err.println(ex.getClass());
        }
    }

    /**
     * Deletes the file that has been used for all other functions
     */
    protected void deleteFile() {
        try {
            File file = new File("File.txt"); // filepath is relative to the FileHandling folder...
            if (file.delete()) {
                System.out.println("File was deleted successfully at " + file.getAbsolutePath());
            } else {
                System.out.println("Could not delete file at " + file.getAbsolutePath());
            }
        } catch (SecurityException ex) {
            System.err.println(ex.getClass());
        }
    }
}
