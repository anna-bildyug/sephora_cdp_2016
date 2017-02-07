package com.epam.cdp.oopexample.domain;

import com.epam.cdp.oopexample.domain.apparel.AbstractApparel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Anna_Bildyug
 */
public class Rack {

    private List<AbstractApparel> apparels = new ArrayList<AbstractApparel>();

    public void clean()
    {
        getApparels().clear();
    }

    public void addApparel(AbstractApparel apparel)
    {
        getApparels().add(apparel);
    }

    public List<AbstractApparel> findBy(Predicate<AbstractApparel> predicate)
    {
        return getApparels().stream().filter(predicate).collect(Collectors.toList());
    }

    public int getApparelCost()
    {
        return getApparels().stream().mapToInt(value -> value.getCost()).sum();
    }

    public int getApparelAmount()
    {
        return getApparels().size();
    }

    public List<AbstractApparel> getApparels() {
        return apparels;
    }

    @Override
    public String toString()
    {
        return "Your rack: " + System.lineSeparator() + apparels.toString();
    }
}
