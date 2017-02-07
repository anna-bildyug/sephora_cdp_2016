package com.epam.cdp.oopexample;

import com.epam.cdp.oopexample.domain.Rack;
import com.epam.cdp.oopexample.domain.helper.Butler;
import com.epam.cdp.oopexample.util.messenger.ConsoleMessenger;
import com.epam.cdp.oopexample.util.messenger.Messenger;

/**
 * Created by Anna_Bildyug
 */
public class Runner {

    public static void main(String [] args)
    {
        Messenger messenger = new ConsoleMessenger();
        Butler butler = new Butler(messenger);
        butler.setRack(new Rack());
        butler.start();
    }
}
