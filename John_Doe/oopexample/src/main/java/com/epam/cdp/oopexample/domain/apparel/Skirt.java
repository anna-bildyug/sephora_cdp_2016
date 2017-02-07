package com.epam.cdp.oopexample.domain.apparel;

import com.epam.cdp.oopexample.domain.parameter.Color;

/**
 * Created by Anna_Bildyug
 */
public class Skirt extends AbstractApparel{

    public Skirt(String modelName, Color color, int cost) {
        super(modelName, color, cost);
    }

    @Override
    public String getDescription()
    {
        return "The skirt will be real adornment!";
    }

    @Override
    public String toString()
    {
        return "Skirt: " + super.toString();
    }
}
