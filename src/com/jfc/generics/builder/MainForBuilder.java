package com.jfc.generics.builder;

public class MainForBuilder {

    public static void main(String args[]){
        Person person = Builder.of(() -> new Person(null,0,null))
                .with(Person::setName,"Juan Diaz")
                .with(Person::setAge,18)
                .build();

        Car car = Builder.of(() -> new Car(null,null,0))
                    .with(Car::setMake,"Toyota")
                    .with(Car::setModel,"Camry")
                    .with(Car::setYear,2021)
                .build();

        System.out.println(car.getMake()+ " " +person.getName());

    }

}
