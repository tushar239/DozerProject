package sample.dozer.beans;

/**
 * Created by chokst on 11/13/14.
 */
public class Address {
    private String street;
    private String city;
    private String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Address) {
            Address add = (Address)obj;
            if(add.getCity().equals(this.getCity()) && add.getState().equals(this.getState()) && add.getStreet().equals(this.getStreet())) {
                return true;
            }
        }
        return false;
    }
}
