package dk.easv.be;

public class Country {

    private String name;
    private double vatRate;

    public Country(String name, double vatRate)
    {
        this.name = name;
        this.vatRate = vatRate;
    }

    public String getName() {
        return name;
    }

    public double getVATRate() {
        return vatRate;
    }

}
