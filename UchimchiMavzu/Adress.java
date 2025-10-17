package UchimchiMavzu;

 final class  Adress {
   private final String region;
   private final String street;

    public Adress(String region, String street) {
        this.region = region;
        this.street = street;
    }

    public String getRegion() {
        return region;
    }

    public String getStreet() {
        return street;
    }
    @Override
    public String toString() {
        return "Adress{" +
                "region='" + region + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
