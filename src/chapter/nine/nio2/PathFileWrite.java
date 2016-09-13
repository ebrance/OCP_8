package chapter.nine.nio2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Edward on 9/13/2016.
 */
public class PathFileWrite {

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Edward\\Java_8\\NIO2\\Write\\hello_world.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.US_ASCII))
        {

            writer.write("Hello World!");
            writer.newLine();
            writer.write("The quick brown fox jumps over the lazy dog.");
            System.out.println("Finished writing.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
