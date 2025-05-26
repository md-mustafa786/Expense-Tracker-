import java.util.*;
import java.time.LocalDate;

public class ExpenseTracker {
    private static Scanner scanner = new Scanner(System.in);
    private static TransactionManager manager = new TransactionManager();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Expense Tracker Menu ---");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. Load from file");
            System.out.println("4. Save to file");
            System.out.println("5. Monthly Summary");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addTransaction(Transaction.Type.INCOME);
                case 2 -> addTransaction(Transaction.Type.EXPENSE);
                case 3 -> loadFile();
                case 4 -> saveFile();
                case 5 -> showSummary();
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private static void addTransaction(Transaction.Type type) {
        scanner.nextLine();
        System.out.print("Enter category (e.g., Salary, Business, Food, Rent, Travel): ");
        String category = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        Transaction t = new Transaction(type, category, amount, LocalDate.now());
        manager.addTransaction(t);
        System.out.println("Transaction added!");
    }

    private static void loadFile() {
        scanner.nextLine();
        System.out.print("Enter file name to load: ");
        String fileName = scanner.nextLine();
        try {
            manager.loadFromFile(fileName);
            System.out.println("Data loaded successfully.");
        } catch (Exception e) {
            System.out.println("Failed to load file.");
        }
    }

    private static void saveFile() {
        scanner.nextLine();
        System.out.print("Enter file name to save: ");
        String fileName = scanner.nextLine();
        try {
            manager.saveToFile(fileName);
            System.out.println("Data saved successfully.");
        } catch (Exception e) {
            System.out.println("Failed to save file.");
        }
    }

    private static void showSummary() {
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        manager.printMonthlySummary(month, year);
    }
}

