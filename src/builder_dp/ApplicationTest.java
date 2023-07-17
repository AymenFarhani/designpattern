package builder_dp;

public class ApplicationTest {
    public static void main(String[] args) {
        Address address = new Address.AddressBuilder()
                .streetName("Av du martin pecheur")
                .streetNumber(52)
                .postalCode(1170)
                .city("Brussels")
                .build();
        Employee employee = new Employee.EmployeeBuilder()
                .cinNumber(920628587)
                .firstName("Aymen")
                .lastName("Farhani")
                .age(31)
                .email("aymenfarhani28@gmail.com")
                .phoneNumber("00493336038")
                .address(address)
                .build();
        System.out.println(employee);
    }
}
