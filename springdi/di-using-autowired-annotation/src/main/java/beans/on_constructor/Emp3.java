package beans.on_constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp3 {
    Address3 address3;

    Emp3() {
    }

    @Autowired
    public void setaddress2(Address3 address3) {
        this.address3 = address3;
    }

    public Emp3(Address3 address3) {
        this.address3 = address3;
    }

    @Override
    public String toString() {
        return "Emp3{" +
                "address3=" + address3.city + "," + address3.state +
                '}';
    }
}
