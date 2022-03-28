package io.github.anantharajuc.gcs.generics;

import io.github.anantharajuc.gcs.generics.example_automobile.Car;
/*
 * Since Car is an interface, T must be a class that implements car.
 */
public class Store_Generic_Bounded_Type_Interface<T extends Car> {
    T value;

    public Store_Generic_Bounded_Type_Interface(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
