import java.util.ArrayList;
import java.util.List;

public class Country {
    private String country;
    private List<Country> countries = new ArrayList<>();

    public Country(String country) {
        this.country = country;
    }


    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    @Override
    public String toString() { return "Country{" + "country='" + country + '\'' + '}'; }
}
