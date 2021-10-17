package com.example.microservices.limitsservice.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Limits {
    private int minimum;
    private int maximum;


    public Limits(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
}
