package app.domain;

public class CustomerFactory {

    public static Customer build() {
        return new Customer(35, "03839947561", "Avner Caleb", 3000D, "SP");
    }

    public static Customer build(Double salario) {
        return new Customer(35, "03839947561", "Avner Caleb", salario, "SP");
    }

    public static Customer build(Integer age) {
        return new Customer(age, "03839947561", "Avner Caleb", 3000D, "SP");
    }

    public static Customer build(String location) {
        return new Customer(35, "03839947561", "Avner Caleb", 3000D, location);
    }
}
