package beans.on_setter_method;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp1 {
    Address1 address1;

    Emp1() {
    }

    @Autowired
    public void setAddress1(Address1 address1) {
        this.address1 = address1;
    }

    public Emp1(Address1 address1) {
        this.address1 = address1;
    }

    @Override
    public String toString() {
        return "Emp1{" +
                "address1=" + address1.city + "," + address1.state +
                '}';
    }
}
