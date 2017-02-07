package com.epam.cdp.oopexample.domain.apparel;

import com.epam.cdp.oopexample.domain.parameter.Color;

/**
 * Created by Anna_Bildyug
 */
public class Coat extends AbstractApparel{

    public Coat(String modelName, Color color, int cost) {
        super(modelName, color, cost);
    }

    @Override
    public String getDescription()
    {
        return "The great coat for you!";
    }

    @Override
    public String toString()
    {
        return "Coat: " + super.toString();
    }
}
