package builder_dp;

public class Employee {
    private final int cinNumber;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String email;
    private final String phoneNumber;
    private final Address address;

    private Employee (EmployeeBuilder employeeBuilder) {
        this.cinNumber = employeeBuilder.cinNumber;
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.age = employeeBuilder.age;
        this.email = employeeBuilder.email;
        this.phoneNumber =employeeBuilder.phoneNumber;
        this.address = employeeBuilder.address;
    }

    public static class EmployeeBuilder {
        private int cinNumber;
        private String firstName;
        private String lastName;
        private int age;
        private String email;
        private String phoneNumber;
        private Address address;

        public EmployeeBuilder cinNumber(int cinNumber) {
            this.cinNumber = cinNumber;
            return this;
        }

        public EmployeeBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder age(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder email(String email) {
            this.email = email;
            return this;
        }

        public EmployeeBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public EmployeeBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "cinNumber=" + cinNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ",\n  address=" + address +
                '}';
    }
}
