public class CarLoan extends Loan {
    private String car_lien;

    // No-arg constructor
    public CarLoan() {
        super();
        this.car_lien = "";
    }

    // Method to assign value to the lien
    public void setCarLien(String car_lien) {
        this.car_lien = car_lien;
    }

    // Method to get the value of the lien
    public String getCarLien() {
        return this.car_lien;
    }

    // Implement abstract method to indicate loan type
    @Override
    public String getLoanType() {
        return "Car Loan";
    }
}