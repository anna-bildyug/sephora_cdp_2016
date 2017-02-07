package com.epam.cdp.oopexample.domain.factory;

import java.util.Random;

import com.epam.cdp.oopexample.domain.apparel.AbstractApparel;
import com.epam.cdp.oopexample.domain.apparel.Coat;
import com.epam.cdp.oopexample.domain.apparel.Dress;
import com.epam.cdp.oopexample.domain.apparel.Skirt;
import com.epam.cdp.oopexample.domain.apparel.Sweater;
import com.epam.cdp.oopexample.domain.parameter.Color;

/**
 * Created by Anna_Bildyug
 */
public class ApparelRandomFactory
{
    private static final int VARIANTS_AMOUNT = 4;

    private static ApparelRandomFactory instance;

    private Random random = new Random();

    private ApparelRandomFactory()
    {
    }

    public AbstractApparel createRandomApparel()
    {
        int variant = random.nextInt(VARIANTS_AMOUNT - 1 + 1) + 1;
        int cost = random.nextInt(1000);
        Color[] colors = Color.values();
        Color color = colors[random.nextInt(colors.length - 1)];
        switch (variant)
        {
            case 1:
                return new Coat("Coat", color, cost);
            case 2:
                return new Dress("Dress", color, cost);
            case 3:
                return new Skirt("Skirt", color, cost);
            case 4:
                return new Sweater("Sweater", color, cost);
            default:
                return new Coat("Coat", color, cost);
        }
    }

    public static ApparelRandomFactory getInstance()
    {
        if (instance == null)
        {
            instance = new ApparelRandomFactory();
        }
        return instance;
    }
}
