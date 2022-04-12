package beans.on_constructor;

public class Address3 {
    String city, state;

    Address3() {
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address3(String city, String state) {
        this.city = city;
        this.state = state;
    }
}
