package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{20+80}")
    private int x;
    @Value("#{1+3}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(34)}")
    private int z;
    @Value("#{T(java.lang.Math).PI}")
    private double e;
    @Value("#{8>3}")
    private boolean isActive;
    @Value("#{new java.lang.String('Chaitanya')}")
    private String name;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Demo(int x, int y, int z, double e, boolean isActive, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.e = e;
        this.isActive = isActive;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", isActive=" + isActive +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public Demo(double e) {
        this.e = e;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Demo() {
    }
}
