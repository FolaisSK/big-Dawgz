package ch16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TransactionWriter {
    public static void writeToJsonFile(List<Transaction> transactionList){
        StringBuilder builder = new StringBuilder();
        String filePath = "/Users/folajimi/Desktop/transactions.json";
        Path location = Paths.get(filePath);

        for(Transaction t : transactionList){
            builder.append(t.toString());
        }

        String text = String.valueOf(builder);

        try{
            Files.write(location, text.getBytes());
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
