package immutable.address;

public class Address {

    public Address(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }

}
