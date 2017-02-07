package com.epam.cdp.oopexample.domain.helper;

import com.epam.cdp.oopexample.domain.Rack;
import com.epam.cdp.oopexample.domain.apparel.AbstractApparel;
import com.epam.cdp.oopexample.domain.factory.ApparelRandomFactory;
import com.epam.cdp.oopexample.domain.parameter.Color;
import com.epam.cdp.oopexample.util.messenger.Messenger;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Anna_Bildyug
 */
public class Butler {

    public static final int EXIT_CODE = 100;
    private Messenger messenger;
    private Rack rack;

    public Butler(Messenger messenger) {
        this.messenger = messenger;
    }

    public void start() {
        greet();
        int command = propose();
        while (command != EXIT_CODE) {
            manage(command);
            command = propose();
        }
    }

    private void manage(int command) {
            switch (command)
            {
                case 1:
                    ApparelRandomFactory randomFactory = ApparelRandomFactory.getInstance();
                    rack.clean();
                    for (int i = 0; i < 10; i++)
                    {
                        rack.addApparel(randomFactory.createRandomApparel());
                    }
                    break;
                case 2:
                    messenger.write("Please, choose color from "+ Arrays.toString(Color.values()));
                    String color = messenger.read();
                    List<AbstractApparel> filtered = rack.findBy(apparel -> color.equals(apparel.getColor().name()));
                    messenger.write(filtered.toString());
                    break;
                case 3:
                    messenger.write("Cost: " + rack.getApparelCost() + "$");
                    break;
                case 4:
                    messenger.write(rack.toString());
                    break;
                default:
                    getMessenger().write("I can't do this!");
                    break;
            }

    }

    private void greet() {
        getMessenger().write("Hi! I'm your butler! Today I will help you to collect your clothes!");
    }

    private int propose() {
        printMenu();
        int result = 0;
        while (result == 0) {
            try {
                result = Integer.valueOf(getMessenger().read());
            } catch (NumberFormatException e) {
                getMessenger().write("Something get wrong. Try again.");
            }
        }
        return result;
    }

    private void printMenu() {
        getMessenger().write("What do you want to do?");
        getMessenger().write("1. Put random clothes on your rock.");
        getMessenger().write("2. Find all clothes by color.");
        getMessenger().write("3. Know how much does it cost.");
        getMessenger().write("4. Know what exactly I added.");
        getMessenger().write("100. Exit.");
    }

    public Messenger getMessenger() {
        return messenger;
    }

    public void setMessenger(Messenger messenger) {
        this.messenger = messenger;
    }

    public void setRack(Rack rack)
    {
        this.rack = rack;
    }
}
