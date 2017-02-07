package com.epam.cdp.oopexample.util.messenger;

import java.io.IOException;

/**
 * Created by Anna_Bildyug
 */
public interface Messenger {

    void write(String message);

    String read();
}
