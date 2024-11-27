package com.codingshuttle.cakemaker;

import com.codingshuttle.cakemaker.repo.Frosting;
import com.codingshuttle.cakemaker.repo.Syrup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    final private Frosting frosting;
    final private Syrup syrup;

    @Autowired
    public CakeBaker( Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup  = syrup;
    }


    public String bakeCake() {
        return "Cake baked with " + frosting.getFrostingType() + " and " + syrup.getSyrupType();
    }

}
