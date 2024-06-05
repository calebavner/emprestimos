package app.domain;

public class Customer {

    private Integer age;
    private String cpf;
    private String name;
    private Double income;
    private String location;

    public Customer(Integer age, String cpf, String name, Double income, String location) {
        this.age = age;
        this.cpf = cpf;
        this.name = name;
        this.income = income;
        this.location = location;
    }

    public boolean thisIncomeIsEqualsOrLowerThan(Double value) {
        return income <= value;
    }

    public boolean thisIncomeIsEqualsOrBiggerThan(Double value) {
        return income >= value;
    }

    public boolean thisIncomeBetweenThan(Double minValue, Double maxValue) {
        return income >= minValue && income <= maxValue;
    }

    public boolean thisAgeLowerThan(Integer value) {
        return age < value;
    }

    public boolean thisLocationIsEqualsThan(String value) {
        return location.equalsIgnoreCase(value);
    }
}
