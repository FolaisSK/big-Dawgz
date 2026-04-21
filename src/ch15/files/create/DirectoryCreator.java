package ch15.files.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryCreator {
    public static void createDirectory(Path path){
        try{
            System.out.println("filePath::" + path);
            Files.createDirectory(path);
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
