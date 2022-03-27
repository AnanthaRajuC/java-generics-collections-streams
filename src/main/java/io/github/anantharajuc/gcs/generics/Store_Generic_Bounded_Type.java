package io.github.anantharajuc.gcs.generics;

/*
 * T should be a class that extends number. (i.e., a subclass of Number)
 * T can also be Number class.
 */
public class Store_Generic_Bounded_Type<T extends Number> {
    T value;

    public Store_Generic_Bounded_Type(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
