package app.controller;

import app.controller.dto.CustomerLoanRequest;
import app.controller.dto.CustomerLoanResponse;
import app.service.LoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    private final LoanService loanService;

    public LoansController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/customer-loans")
    public ResponseEntity<CustomerLoanResponse> customerLoans(@RequestBody CustomerLoanRequest request) {
        return ResponseEntity.ok(loanService.checkLoansAvailable(request));
    }
}
