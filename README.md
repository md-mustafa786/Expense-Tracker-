# 💰 Expense Tracker (Java Console Application)

A simple and powerful console-based Expense Tracker built using Java. Track your income and expenses, save/load from file, and view monthly summaries — all from your terminal.

## 🚀 Features

- ✅ Add Income or Expense  
- 📂 Load transactions from a file  
- 💾 Save transactions 
- 📊 Monthly income/expense summary  
- 🗂️ Categorize transactions  
- 🕓 Uses `LocalDate` for date tracking  

## 🛠️ Technologies Used

- Java 17+  
- Collections (ArrayList)  
- File I/O (BufferedReader / BufferedWriter)  
- Java Time API (`LocalDate`)  
- IntelliJ IDEA (recommended)  

## 📁 Project Structure

ExpenseTracker/  
├── ExpenseTracker.java          # Main application class with menu  
├── Transaction.java             # Model for income/expense  
├── TransactionManager.java      # Logic to handle transactions  
├── data.txt                     # Sample data file  
└── README.md                    # Project info  

## 🧪 How to Run

Compile:
javac ExpenseTracker.java Transaction.java TransactionManager.java

Run:
java ExpenseTracker

## 📝 File Format (CSV)

Each line in the file should follow this format:  
TYPE,CATEGORY,AMOUNT,DATE

Example:
INCOME,Salary,50000,2025-05-01  
EXPENSE,Food,1200,2025-05-02

## 🧾 Sample Menu UI

--- Expense Tracker Menu ---
1. Add Income
2. Add Expense
3. Load from file
4. Save to file
5. Monthly Summary
6. Exit

## 👨‍💻 Author

Mohammad Mustafa  
Java Backend Developer

📍 India
