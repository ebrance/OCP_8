package chapter.nine.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Edward on 9/11/2016.
 */
public class PathFilePathTest {

    public static void printPathInformation(Path path) {

        System.out.println("Filename is: " + path.getFileName());
        System.out.println("Root is: " + path.getRoot());

        Path currentParent = path;

        while((currentParent = currentParent.getParent()) != null) {

            System.out.println("Current parent is: " + currentParent);
        }

        System.out.println();

        for (int i = 0; i < path.getNameCount(); i++) {

            System.out.println("Path component (" + String.valueOf(i) + ") is: " + path.getName(i));
        }
    }

    public static void IsAbsolute(Path path) {

        System.out.println("Path is Absolute? " + path.isAbsolute());
    }

    public static void ToAbsolutePath(Path path) {

        System.out.println("Absolute Path " + path.toAbsolutePath());
    }

    public static void main(String[] args) {

        printPathInformation(Paths.get("\\zoo\\armadillo\\shells.txt"));
        System.out.println();
        printPathInformation(Paths.get("armadillo\\shells.txt"));
        System.out.println();
        IsAbsolute(Paths.get("C:\\birds\\egret.txt"));
        System.out.println();
        IsAbsolute(Paths.get("birds/condor.txt"));
        System.out.println();
        ToAbsolutePath(Paths.get("C:\\birds\\egret.txt"));
        System.out.println();
        ToAbsolutePath(Paths.get("birds/condor.txt"));
    }
}
