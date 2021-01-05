import java.util.Objects;

public class ScratchPad {
    public static void main(String[] args) {

        Address address1 = new Address("얼수","서울시");
        Address address2 = new Address("얼수","서울시");

        System.out.println(address1.equals(address2));
    }
}

class Address{
    String name;
    String location;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(name, address.name) &&
                Objects.equals(location, address.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }

    Address(String name, String location){
        this.name=name;
        this.location=location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
