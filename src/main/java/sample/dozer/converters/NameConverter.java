package sample.dozer.converters;

import org.dozer.CustomConverter;

/**
 * Created by chokst on 11/13/14.
 */
public class NameConverter<Person, Person1> implements CustomConverter {


    @Override
    public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass, Class<?> sourceClass) {
        if(sourceFieldValue == null) {
            return null;
        } else {
            return "Name is "+sourceFieldValue;
        }
    }
}
