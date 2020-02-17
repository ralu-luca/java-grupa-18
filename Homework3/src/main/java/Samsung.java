public abstract class Samsung {
    private String manufacturer;
    private String model;
    private final long batteryLife;

    protected Samsung(long batteryLife) {
        this.batteryLife = batteryLife;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatteryLife() {
        return (int) batteryLife;
    }
}
