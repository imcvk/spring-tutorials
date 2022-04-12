package beans.on_properties;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp2 {
    Address2 address2;

    Emp2() {
    }

    @Autowired
    public void setaddress2(Address2 address2) {
        this.address2 = address2;
    }

    public Emp2(Address2 address2) {
        this.address2 = address2;
    }

    @Override
    public String toString() {
        return "Emp2{" +
                "address2=" + address2.city + "," + address2.state +
                '}';
    }
}
