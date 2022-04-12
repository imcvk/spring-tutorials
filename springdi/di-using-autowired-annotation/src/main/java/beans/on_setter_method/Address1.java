package beans.on_setter_method;

public class Address1 {
    String city,state;
Address1(){}
    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address1(String city, String state) {
        this.city = city;
        this.state = state;
    }
}
