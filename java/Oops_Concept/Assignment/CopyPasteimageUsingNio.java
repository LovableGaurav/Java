package Assignment;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
public class CopyPasteimageUsingNio {
        public static void main(String[] args) {
            // Define the source and target paths
            Path source = Paths.get("C:\\Users\\gk812\\Desktop\\java\\java\\Oops_Concept\\Assignment\\Untitled.png");
            Path target = Paths.get("C:\\Users\\gk812\\Desktop\\java\\java\\Oops_Concept\\Assignment\\Copied.png");

            try {
                // Copy the file
                Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image copied successfully from " + source + " to " + target);

            } catch (IOException e) {
                System.err.format("I/O error occurred during file copy: %s%n", e.getMessage());
                e.printStackTrace();
            }
        }
    }
