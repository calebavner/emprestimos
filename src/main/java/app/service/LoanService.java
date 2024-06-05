package app.service;

import app.controller.dto.CustomerLoanRequest;
import app.controller.dto.CustomerLoanResponse;
import app.controller.dto.LoanResponse;
import app.domain.Customer;
import app.domain.Loan;
import app.domain.LoanType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public CustomerLoanResponse checkLoansAvailable(CustomerLoanRequest request) {

        Customer customer = request.toCustomer();
        Loan loan = new Loan(customer);
        List<LoanResponse> loans = new ArrayList<>();

        if(loan.isPersonalLoanAvailable()){
            loans.add(new LoanResponse(LoanType.PERSONAL, loan.getPersonalInterestRate()));
        }

        if(loan.isGuaranteedLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.GUARANTEED, loan.getGuaranteedInterestRate()));
        }

        if(loan.isConsignmentLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.CONSIGNMENT, loan.getConsignmentInterestRate()));
        }

        return new CustomerLoanResponse(request.name(), loans);
    }
}
