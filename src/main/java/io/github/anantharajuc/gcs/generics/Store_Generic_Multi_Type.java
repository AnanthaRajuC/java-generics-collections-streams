package io.github.anantharajuc.gcs.generics;

public class Store_Generic_Multi_Type<U, V> {
    U value1;
    V value2;

    public Store_Generic_Multi_Type(U value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public U getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}
