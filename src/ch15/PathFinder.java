package ch15;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PathFinder {
    static void main() {
        String fileLocation = "a/b/c"; // a ==> root directory, c ==> file
        Path path = Paths.get(fileLocation);

        System.out.println(path.getFileSystem()); // detect the operating system,
    }
}
