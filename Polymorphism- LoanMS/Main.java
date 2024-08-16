public class Main {
    public static void main(String[] args) {
        // Create CarLoan objects
        CarLoan loan1 = new CarLoan();
        CarLoan loan2 = new CarLoan();

        // Assign values to their id, type, amount, and name
        loan1.setLoanId(1);
        loan1.setCustName("John Doe");
        loan1.setLoanAmount(10000);
        loan1.setCarLien("ABC Bank");

        loan2.setLoanId(2);
        loan2.setCustName("Jane Doe");
        loan2.setLoanAmount(15000);
        loan2.setCarLien("XYZ Bank");

        // Display all the values
        System.out.println("Loan 1:");
        System.out.println("ID: " + loan1.getLoanId());
        System.out.println("Type: " + loan1.getLoanType());
        System.out.println("Amount: " + loan1.getLoanAmount());
        System.out.println("Name: " + loan1.getCustName());
        System.out.println("Lien: " + loan1.getCarLien());

        System.out.println("\nLoan 2:");
        System.out.println("ID: " + loan2.getLoanId());
        System.out.println("Type: " + loan2.getLoanType());
        System.out.println("Amount: " + loan2.getLoanAmount());
        System.out.println("Name: " + loan2.getCustName());
        System.out.println("Lien: " + loan2.getCarLien());
    }
}