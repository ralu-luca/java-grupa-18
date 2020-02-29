import java.util.ArrayList;
import java.util.List;

public class Address{
    private String street;
    private int number;
    private String town;
    List<Address> address = new ArrayList<>();

    public Address(String street, int number, String town) {
        this.street = street;
        this.number = number;
        this.town = town;
    }


    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }

    public int getNumber() { return number; }

    public void setNumber(int number) { this.number = number; }

    public String getTown() { return town; }

    public void setTown(String town) { this.town = town; }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
