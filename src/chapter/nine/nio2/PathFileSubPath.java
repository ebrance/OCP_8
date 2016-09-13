package chapter.nine.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Edward on 9/11/2016.
 */
public class PathFileSubPath {

    public static void main(String[] args) {

        Path path = Paths.get("/mammal/carnivore/racoon.image");

        System.out.println("Path is: " + path);

        System.out.println("Subpath from 0 to 3 is: " + path.subpath(0, 3));
        System.out.println("Subpath from 1 to 3 is: " + path.subpath(1, 3));
        System.out.println("Subpath from 1 to 2 is: " + path.subpath(1, 2));
    }
}
