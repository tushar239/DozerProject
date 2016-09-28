package sample.dozer.test;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import sample.dozer.beans.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chokst on 11/13/14.
 */
public class DozerTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        // Add the mapping configuration
        list.add("dozerPersonMapping.xml");

        {
            // Add to DozerMapper
            //Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();
            Mapper mapper = new DozerBeanMapper(list);

            Person person = new Person();
            person.setName("Tushar");
            person.setAge(21);
            Address addr = new Address();
            addr.setStreet("street1");
            addr.setCity("Redmond");
            addr.setState("WA");
            person.setAdrs(addr);

            Person1 person1 = mapper.map(person, Person1.class, "personMapping");
            System.out.println("Name:" + person1.getName1());
            System.out.println("Age:" + person1.getAge1());
            System.out.println("Address Street:" + person1.getAdrs1().getStreet1());
            System.out.println("Address City:" + person1.getAdrs1().getCity1());
            System.out.println("Address State:" + person1.getAdrs1().getState1());
        }
        {
            System.out.println("List to list mapping example......");

            Mapper mapper = new DozerBeanMapper(list);
            ListBean listBean = new ListBean();

            Address a1 = new Address();
            a1.setStreet("street1");
            a1.setCity("Redmond1");
            a1.setState("WA1");

            listBean.getAdrsList().add(a1);

            Address a2 = new Address();
            a2.setStreet("street2");
            a2.setCity("Redmond2");
            a2.setState("WA2");

            listBean.getAdrsList().add(a2);

            Address a3 = new Address();
            a3.setStreet("street3");
            a3.setCity("Redmond3");
            a3.setState("WA3");

            listBean.getAdrsList().add(a3);

            ListBean1 listBean1 = new ListBean1();
            listBean1.getAdrsList1().add(a1);

            mapper.map(listBean, listBean1, "listBeanMapping");

            List<Address> addresses = listBean1.getAdrsList1();
            for(Address address : addresses) {
                System.out.println(address.getStreet()+" : "+address.getCity()+" : "+address.getState());
            }

            System.out.println("List to Array mapping example.....");
            Address[] addrs = listBean1.getAdrsArray1();
            for(Address addr : addrs) {
                System.out.println(addr.getStreet()+" : "+addr.getCity()+" : "+addr.getState());
            }

            /*
            // This is not possible because in dozerPersonMapping.xml, type="one-way".
            // If you take out type="one-way", this will work.

            ListBean anotherListBean = mapper.map(listBean1, ListBean.class, "listBeanMapping");
            */

        }
        /* Not sure how to make field level mapping work
        {
            System.out.println("Field level mapping example......");

            Mapper mapper = new DozerBeanMapper(list);

            Address a1 = new Address();
            a1.setStreet("street1");
            a1.setCity("Redmond1");
            a1.setState("WA1");

            Address a2 = new Address();
            a2.setStreet("street2");
            a2.setCity("Redmond2");
            a2.setState("WA2");

            Address a3 = new Address();
            a3.setStreet("street3");
            a3.setCity("Redmond3");
            a3.setState("WA3");

            List<Address> addrList = new ArrayList<Address>();
            addrList.add(a1);
            addrList.add(a2);
            addrList.add(a3);

            ListBean listBean = new ListBean();
            listBean.setAdrsList(addrList);

            List<Address> anotherAddrList = mapper.map(addrList, ArrayList.class, "fieldlLevelListBeanMapping");
        } */

    }
}
