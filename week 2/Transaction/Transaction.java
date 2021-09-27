public class Transaction {
    // thuoc tinh
    private String operation;
    private double amount;
    private double balance;

    public static final String DEPOSIT;
    public static final String WITHDRAW;

    static {
        DEPOSIT = "deposit";
        WITHDRAW = "withdraw";
    }

    // constructor
    /**
     * Constructor.
     * 
     * @param operation String
     * @param amount    double
     * @param balance   double
     */
    Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    // getter
    /**
     * Get operation method.
     * 
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Get amount method.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Get balance method.
     * 
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    // setter
    /**
     * Set operation method.
     * 
     * @param operation String
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Set amount method.
     * 
     * @param amount double
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Set balance method.
     * 
     * @param balance double
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

}