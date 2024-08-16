public abstract class Loan {
    protected int loan_id;
    protected String loan_type;
    protected double amount;
    protected String cust_name;

    // Default no-arg constructor
    public Loan() {
        this.amount = 0;
    }

    // Set methods for loan_id and cust_name
    public void setLoanId(int loan_id) {
        this.loan_id = loan_id;
    }

    public void setCustName(String cust_name) {
        this.cust_name = cust_name;
    }

    // Get methods for loan_id and cust_name
    public int getLoanId() {
        return this.loan_id;
    }

    public String getCustName() {
        return this.cust_name;
    }

    // Method to set loan amount
    public void setLoanAmount(double amount) {
        this.amount = amount;
    }

    // Method to get loan amount
    public double getLoanAmount() {
        return this.amount;
    }

    // Abstract method to indicate loan type
    public abstract String getLoanType();
}