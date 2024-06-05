package app.domain;

public class Loan {
    Customer customer;

    public Loan(Customer customer) {
        this.customer = customer;
    }

    public boolean isPersonalLoanAvailable() {
        return validateBasicInfos();
    }

    public boolean isGuaranteedLoanAvailable() {
        return customer.thisIncomeIsEqualsOrBiggerThan(5000D);
    }

    public boolean isConsignmentLoanAvailable() {
        return validateBasicInfos();
    }

    public boolean validateBasicInfos() {
        if(customer.thisIncomeisEqualsOrLowerThan(3000D)) {
            return true;
        }
        return  customer.thisIncomeBetweenThan(3000D, 5000D)
                && customer.thisAgeLowerThan(30)
                && customer.thisLocationIsEqualsThan("SP");
    }

    public Double getPersonalInterestRate() {
        return 4D;
    }

    public Double getGuaranteedInterestRate() {
        return 3D;
    }

    public Double getConsignmentInterestRate() {
        return 2D;
    }
}
