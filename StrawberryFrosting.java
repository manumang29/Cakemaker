package com.codingshuttle.cakemaker.implementation;

import com.codingshuttle.cakemaker.repo.Frosting;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.frosting", havingValue = "strawberry")
public class StrawberryFrosting implements Frosting {
    public String getFrostingType() {
        return "Strawberry Frosting";
    }
}
