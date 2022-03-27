package io.github.anantharajuc.gcs;

import io.github.anantharajuc.gcs.generics.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Object class is the parent class of all objects.
 */
@Log4j2
@SpringBootApplication
public class GenericsCollectionsStreamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenericsCollectionsStreamsApplication.class, args);
		log.info("Generics Collections Streams Application is running...");

		Object w = true;
		Object x = 4;
		Object y = "4";
		Object z = '4';

		log.info("w is of type: {}", w.getClass().getName());
		log.info("x is of type: {}", x.getClass().getName());
		log.info("y is of type: {}", y.getClass().getName());
		log.info("z is of type: {}", z.getClass().getName());

		//Manual Boxing
		var s = new Store_Object(4);
		int t = (Integer) s.getValue();
		log.info("value of t is: {}", t);

		var u = new Store_Object("hello");
		String v = (String) u.getValue();
		log.info("value of v is: {}", v);

		//Generics
		var storeGenericInteger  = new Store_Generic<Integer>(4);
		int b = storeGenericInteger.getValue();

		//Generics
		var storeGenericString  = new Store_Generic<String>("Hello");
		String c = storeGenericString.getValue();

		//Generics with Multi-Type
		var storeGenericMultiType1  = new Store_Generic_Multi_Type<String, Integer>("Hello",6);
		int d = storeGenericMultiType1.getValue2();
		String e = storeGenericMultiType1.getValue1();

		//Generics with Multi-Type
		var storeGenericMultiType2  = new Store_Generic_Multi_Type<Double, Character>(2.34, 'p');
		double f = storeGenericMultiType2.getValue1();
		char g = storeGenericMultiType2.getValue2();

		//Generics with Bounded Type (Ex: Number)
		var storeGenericBoundedType1  = new Store_Generic_Bounded_Type<Integer>(6);
		var storeGenericBoundedType2  = new Store_Generic_Bounded_Type<Double>(5.24);
		var storeGenericBoundedType3  = new Store_Generic_Bounded_Type<ExampleNumber>(new ExampleNumber(6));
	}
}
