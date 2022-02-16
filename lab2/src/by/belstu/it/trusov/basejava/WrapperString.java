package by.belstu.it.trusov.basejava;

import java.util.Objects;

public class WrapperString {
    private String a;
    private int b;

    public void replace(char oldchar, char newchar){
        a.replace(oldchar, newchar);
        System.out.println(a);
    }
    public WrapperString() {
        a = "Hello";
        b = 10;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return b == that.b && Objects.equals(a, that.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "a='" + a + '\'' +
                ", b=" + b +
                '}';
    }

    public void delete(char h) {
    }
}
