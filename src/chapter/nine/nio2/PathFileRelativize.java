package chapter.nine.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Edward on 9/11/2016.
 */
public class PathFileRelativize {

    public  static void main(String[] args) {

        Path path1 = Paths.get("e:\\habitat");
        Path path2 = Paths.get("e:\\sanctuary\\raven");

        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
    }
}
