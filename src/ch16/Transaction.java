package ch16;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Transaction {
    long id;
    String name;
    LocalDate date;
    BigDecimal amount;
    UUID reference;

    public Transaction() {
    }

    public Transaction(long id, String name, LocalDate date, BigDecimal amount, UUID reference) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.amount = amount;
        this.reference = reference;
    }

    @Override
    public String toString(){
        return "Transaction{" +
                "id=" + id +
                ",name=" + name +
                ",amount=" + amount +
                ",reference=" + reference +
                '}';
    }
}
