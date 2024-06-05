package app.controller.dto;

import app.domain.Customer;

public record CustomerLoanRequest(
        Integer age,
        String cpf,
        String name,
        Double income,
        String location
) {
    public Customer toCustomer() {
        return new Customer(
                age,
                cpf,
                name,
                income,
                location);
    }
}
