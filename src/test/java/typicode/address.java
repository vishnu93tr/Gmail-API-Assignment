package typicode;

public class address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private geo geo;

    public address(){

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public typicode.geo getGeo() {
        return geo;
    }

    public void setGeo(typicode.geo geo) {
        this.geo = geo;
    }

    public address(String street, String suite, String city, String zipcode, geo geo){
        this.street=street;
        this.suite=suite;
        this.city=city;
        this.zipcode=zipcode;
        this.geo=geo;
    }
}
