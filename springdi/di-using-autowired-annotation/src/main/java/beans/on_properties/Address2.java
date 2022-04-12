package beans.on_properties;

public class Address2 {
    String city,state;
Address2(){}
    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address2(String city, String state) {
        this.city = city;
        this.state = state;
    }
}
