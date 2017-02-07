package com.epam.cdp.oopexample.domain.apparel;

import com.epam.cdp.oopexample.domain.parameter.Color;

/**
 * Created by Anna_Bildyug
 */
public class Dress extends AbstractApparel{

    public Dress(String modelName, Color color, int cost) {
        super(modelName, color, cost);
    }

    @Override
    public String getDescription()
    {
        return "Buy the dress and you will be happy!";
    }

    @Override
    public String toString()
    {
        return "Dress: " + super.toString();
    }
}
