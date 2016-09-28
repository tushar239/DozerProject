package sample.dozer.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chokst on 11/13/14.
 */
public class ListBean {
    private List<Address> adrsList = new ArrayList<Address>();

    public List<Address> getAdrsList() {
        return adrsList;
    }

    public void setAdrsList(List<Address> adrsList) {
        this.adrsList = adrsList;
    }
}
