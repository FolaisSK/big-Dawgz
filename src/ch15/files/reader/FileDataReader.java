package ch15.files.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDataReader {

    public static String readDataFromFile(Path path){
        try{
            String data = Files.readString(path);
            return data;
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    public static int wordCounter(Path path){
        try{
            String dataFromFile = Files.readString(path);
            String[] array = dataFromFile.split("[^a-zA-Z0-9]");
            return array.length;
        }catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return 0;
    }

}
