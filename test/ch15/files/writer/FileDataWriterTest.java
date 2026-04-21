package ch15.files.writer;

import ch15.files.create.DirectoryCreator;
import ch15.files.deleter.DirectoryDeleter;
import ch15.files.deleter.FileDeleter;
import ch15.files.reader.FileDataReader;
import ch15.files.updater.FileDataUpdater;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileDataWriterTest {

    @Test
    void testCanWriteTextToFile(){
        try {
            String fileLocation = "/Users/folajimi/Documents/bigDawgz/src/ch15/files/output/numbers.txt";
            Path path = Paths.get(fileLocation);
            String text = """
                    10,100,1000,10000,100000
                    
                    """;
            FileDataWriter.writeDataToFile(text, path);
            Files.readString(path);
            String dataFromFile = Files.readString(path);
            assertEquals(text, dataFromFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    void testCanReadFromFile(){
        try{
            String fileLocation = "/Users/folajimi/Documents/bigDawgz/src/ch15/files/output/numbers.txt";
            Path path = Paths.get(fileLocation);
            String expectedText = """
                    10,100,1000,10000,100000
                    
                    """;
            String dataFromFile = FileDataReader.readDataFromFile(path);
            assertEquals(expectedText, dataFromFile);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    void testToCreateAnotherFile(){
     try{
         String fileLocation = "/Users/folajimi/Documents/bigDawgz/src/ch15/files/output/locations.txt";
         Path path = Paths.get(fileLocation);
         String text = """
                 Lagos Abuja Oyo Abia
                 """;
         FileDataWriter.writeDataToFile(text, path);
         Files.readString(path);
         String dataFromFile = Files.readString(path);
         assertEquals(text, dataFromFile);
     }   catch (IOException e){
         e.printStackTrace();
     }
    }

    @Test
    void testToDeleteFile(){
        try{
            String fileLocation = "/Users/folajimi/Documents/bigDawgz/src/ch15/files/output/locations.txt";
            Path path = Paths.get(fileLocation);
            assertTrue(FileDeleter.deleteFile(path));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    void testToCreateDirectory(){
        try{
            String directoryLocation = "/Users/folajimi/Documents/bigDawgz/src/ch15/files/output/1";
            Path path = Paths.get(directoryLocation);
            DirectoryCreator.createDirectory(path);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    void testToDeleteDirectory(){
        try {
            String directoryLocation = "/Users/folajimi/Documents/bigDawgz/src/ch15/files/output/1";
            Path path = Paths.get(directoryLocation);
            if(DirectoryDeleter.isExisting(path))assertTrue(DirectoryDeleter.deleteDirectory(path));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    void testToUpdateFile(){
        try{
            String fileLocation = "/Users/folajimi/Documents/bigDawgz/src/ch15/files/output/numbers.txt";
            Path path = Paths.get(fileLocation);
            String text = "20,200,2000";
            FileDataUpdater.updateDataFromFile(text, path);
            String expectedText = """
                    10,100,1000,10000,100000
                    
                    20,200,2000""";
            String dataFromFile = Files.readString(path);
            assertEquals(expectedText, dataFromFile);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    void testToReadFile_CountNumberOfWordsInFile(){
        try{
            String fileLocation = "/Users/folajimi/Downloads/generated_43500_words.txt";
            Path path = Paths.get(fileLocation);
            int numberOfWords = FileDataReader.wordCounter(path);
            assertEquals(43500, numberOfWords);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}