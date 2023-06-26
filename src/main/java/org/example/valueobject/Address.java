package org.example.valueobject;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String Zipcode;
    private String Street;
    private String Number;
    private String Number2;
    private String City;
    private String State;
}
