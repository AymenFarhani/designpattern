package builder_dp;

public class Address {
    private final String streetName;
    private final int streetNumber;
    private final int postalCode;
    private final String city;
    private Address(AddressBuilder addressBuilder) {
        this.streetName = addressBuilder.streetName;
        this.streetNumber = addressBuilder.streetNumber;
        this.postalCode = addressBuilder.postalCode;
        this.city = addressBuilder.city;
    }
    public static class AddressBuilder {
        private String streetName;
        private int streetNumber;
        private int postalCode;
        private String city;

        public AddressBuilder streetName(String streetName) {
            this.streetName = streetName;
            return this;
        }
        public AddressBuilder streetNumber(int streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }
        public AddressBuilder postalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public AddressBuilder city(String city) {
            this.city = city;
            return this;
        }
        public Address build(){
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                ", postalCode=" + postalCode +
                ", city='" + city + '\'' +
                '}';
    }
}
