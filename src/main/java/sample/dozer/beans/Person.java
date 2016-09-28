package sample.dozer.beans;

/**
 * Created by chokst on 11/13/14.
 */
public class Person {
    private String name;
    private int age;
    private Address adrs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAdrs() {
        return adrs;
    }

    public void setAdrs(Address adrs) {
        this.adrs = adrs;
    }
}
