import java.util.ArrayList;

public class Account {
    // thuoc tinh
    private double balance = 0;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();
    private boolean checker = false;

    /**
     * Deposit method.
     * 
     * @param amount double
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }

        balance += amount;
        checker = true;

        return;
    }

    /**
     * Withdraw method.
     * 
     * @param amount double
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }

        if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }

        balance -= amount;
        checker = true;

        return;
    }

    /**
     * Add Transaction method.
     * 
     * @param amount    double
     * @param operation String
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            checker = false;
            deposit(amount);
            if (checker) {
                transitionList.add(new Transaction(operation, amount, balance));
            }
            return;
        }

        if (operation.equals(Transaction.WITHDRAW)) {
            checker = false;
            withdraw(amount);
            if (checker) {
                transitionList.add(new Transaction(operation, amount, balance));
            }
            return;
        }

        System.out.println("Yeu cau khong hop le!");
        return;
    }

    /**
     * Print Transaction method.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction cur = transitionList.get(i);
            String opr = "Nap tien $";
            if (cur.getOperation().equals(Transaction.WITHDRAW)) {
                opr = "Rut tien $";
            }
            String output = "Giao dich %d: " + opr + "%.2f. So du luc nay: $%.2f.\n";
            System.out.printf(output, (i + 1), cur.getAmount(), cur.getBalance());
        }
        return;
    }
}
