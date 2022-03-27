package io.github.anantharajuc.gcs.generics;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Store_Object {
    Object value;

    public Store_Object(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void valueClass(){
        log.info("Value class is {}", value.getClass());
    }
}
