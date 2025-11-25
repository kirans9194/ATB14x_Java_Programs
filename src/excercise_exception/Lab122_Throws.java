package excercise_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab122_Throws {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("yes");
        }
    }
}
