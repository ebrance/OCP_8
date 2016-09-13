package chapter.nine.nio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Edward on 9/13/2016.
 */
public class PathFileRead {

    public static void main(String[] args) {

        String line;
        Path path = Paths.get("C:\\Edward\\Java_8\\NIO2\\Read\\gopher.txt");

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.US_ASCII))
        {
            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
