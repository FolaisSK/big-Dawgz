package ch16;

import java.math.BigDecimal;
import java.util.List;

public class Utility {
    public static BigDecimal totalOfTransactions(List<Transaction> transactionList){
        BigDecimal total = transactionList.stream().map(transaction -> transaction.amount).reduce(BigDecimal.ZERO, BigDecimal::add);
        return total;
    }
}
