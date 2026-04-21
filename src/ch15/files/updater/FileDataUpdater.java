package ch15.files.updater;

import ch15.files.create.FileCreator;
import ch15.files.deleter.FileDeleter;
import ch15.files.writer.FileDataWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDataUpdater {
    public static void updateDataFromFile(String text, Path path){
        try {
            String fileContents = Files.readString(path);
            StringBuilder builder = new StringBuilder();
            builder.append(fileContents);
            builder.append(text);
            FileDataWriter.writeDataToFile(String.valueOf(builder), path);
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
