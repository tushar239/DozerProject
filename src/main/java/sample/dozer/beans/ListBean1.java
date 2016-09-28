package sample.dozer.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chokst on 11/13/14.
 */
public class ListBean1 {
    private List<Address> adrsList1=new ArrayList<Address>();
    private Address[] adrsArray1;

    public List<Address> getAdrsList1() {
        return adrsList1;
    }

    public void setAdrsList1(List<Address> adrsList1) {
        this.adrsList1 = adrsList1;
    }

    public Address[] getAdrsArray1() {
        return adrsArray1;
    }

    public void setAdrsArray1(Address[] adrsArray1) {
        this.adrsArray1 = adrsArray1;
    }
}
