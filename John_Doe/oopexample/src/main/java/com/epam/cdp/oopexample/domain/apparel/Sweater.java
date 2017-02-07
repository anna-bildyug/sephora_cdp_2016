package com.epam.cdp.oopexample.domain.apparel;

import com.epam.cdp.oopexample.domain.parameter.Color;

/**
 * Created by Anna_Bildyug
 */
public class Sweater extends AbstractApparel{

    public Sweater(String modelName, Color color, int cost) {
        super(modelName, color, cost);
    }

    @Override
    public String getDescription()
    {
        return "There is no any warmer stuff!";
    }

    @Override
    public String toString()
    {
        return "Sweater: " + super.toString();
    }
}

