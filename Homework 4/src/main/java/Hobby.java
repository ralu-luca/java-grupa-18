import java.util.*;

public class Hobby  {
    private long freq;
    private String name;
    private String country;
    private List<Address> addresses = new ArrayList<>();

    public Hobby(long freq, String name, String country, List<Address> addresses) {
        this.freq = freq;
        this.name = name;
        this.country = country;
        this.addresses = addresses;
    }


    public long getFreq() {
        return freq;
    }

    public void setFreq(long freq) {
        this.freq = freq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "freq=" + freq +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
