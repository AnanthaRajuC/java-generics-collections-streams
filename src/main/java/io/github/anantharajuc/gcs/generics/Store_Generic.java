package io.github.anantharajuc.gcs.generics;

import lombok.extern.log4j.Log4j2;

/*
 * By Convention Type Parameter names are single, uppercase letters.
 * 'T' is usually used as a parameter to represent Types.
 */
@Log4j2
public class Store_Generic<T> {
    T value;

    public Store_Generic(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void valueClass(){
        log.info("Value class is {}", value.getClass());
    }
}
