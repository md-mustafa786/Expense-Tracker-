import java.io.*;
import java.util.*;

public class TransactionManager {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public void loadFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            transactions.add(Transaction.fromString(line));
        }
        reader.close();
    }

    public void saveToFile(String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (Transaction t : transactions) {
            writer.write(t.toString());
            writer.newLine();
        }
        writer.close();
    }

    public void printMonthlySummary(int month, int year) {
        double income = 0, expense = 0;
        for (Transaction t : transactions) {
            if (t.getDate().getMonthValue() == month && t.getDate().getYear() == year) {
                if (t.getType() == Transaction.Type.INCOME)
                    income += t.getAmount();
                else
                    expense += t.getAmount();
            }
        }
        System.out.println("Summary for " + month + "/" + year);
        System.out.println("Total Income: " + income);
        System.out.println("Total Expense: " + expense);
        System.out.println("Net Savings: " + (income - expense));
    }
}

