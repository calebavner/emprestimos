package app.controller.dto;

import app.domain.LoanType;

public record LoanResponse(
        LoanType type,
        Double interestRate
) {
}
