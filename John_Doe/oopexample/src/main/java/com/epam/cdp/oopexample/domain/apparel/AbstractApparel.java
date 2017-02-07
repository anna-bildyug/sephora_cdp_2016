package com.epam.cdp.oopexample.domain.apparel;

import com.epam.cdp.oopexample.domain.parameter.Color;

/**
 * Created by Anna_Bildyug
 */
public abstract class AbstractApparel {

    private String modelName;
    private Color color;
    private int cost;

    public AbstractApparel(String modelName, Color color, int cost) {
        this.modelName = modelName;
        this.color = color;
        this.cost = cost;
    }

    public abstract String getDescription();

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString()
    {
        return "modelName=" + modelName + ", color=" + color + ", cost=" + cost + System.lineSeparator();
    }
}
