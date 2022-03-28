package io.github.anantharajuc.gcs.generics;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Store_Generic_Wild_Cards<T> {
  private T[] list;

  public Store_Generic_Wild_Cards(T[] list){
      this.list = list;
  }

  public void greaterThan(Store_Generic_Wild_Cards<?> otherStore){
      if(list.length > otherStore.list.length){
          log.info("True");
      }else{
          log.info("False");
      }
  }
}
