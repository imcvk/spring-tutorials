package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
    @Autowired
    Address address;
    Emp(){}

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address.city +","+address.state+
                '}';
    }

    public Emp(Address address) {
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
