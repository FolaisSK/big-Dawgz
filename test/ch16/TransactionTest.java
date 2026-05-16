package ch16;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {

    @Test
    void writeToFile(){
        List<Transaction> transactionList= List.of(
                new Transaction(1, "Fola", LocalDate.now(), new BigDecimal(10000), UUID.randomUUID()),
                new Transaction(2, "Sharp", LocalDate.now(), new BigDecimal(6000), UUID.randomUUID()),
                new Transaction(3, "Who", LocalDate.now(), new BigDecimal(1000), UUID.randomUUID())
        );
        System.out.println(transactionList);
        TransactionWriter.writeToJsonFile(transactionList);

    }

    @Test
    void totalOfTransactions(){
        List<Transaction> transactionList= List.of(
                new Transaction(1, "Fola", LocalDate.now(), new BigDecimal(10000), UUID.randomUUID()),
                new Transaction(2, "Sharp", LocalDate.now(), new BigDecimal(6000), UUID.randomUUID()),
                new Transaction(3, "Who", LocalDate.now(), new BigDecimal(1000), UUID.randomUUID())
        );

        assertEquals(BigDecimal.valueOf(17000), Utility.totalOfTransactions(transactionList));
    }
}
