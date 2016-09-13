package chapter.nine.nio2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Edward on 9/13/2016.
 */
public class PathFileCopy {

    public static void main(String[] args) {

        try (InputStream is = new FileInputStream("C:\\Edward\\Java_8\\NIO2\\Copy\\source-data.txt");
             OutputStream out = new FileOutputStream("C:\\Edward\\Java_8\\NIO2\\Copy\\output-data.txt"))
                {
                    Files.copy(is, Paths.get("C:\\Edward\\Java_8\\NIO2\\Copy\\wolf.txt"));
                    Files.copy(Paths.get("C:\\Edward\\Java_8\\NIO2\\Copy\\clown.txt"), out);
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
