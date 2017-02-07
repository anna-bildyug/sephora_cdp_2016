package com.epam.cdp.oopexample.util.messenger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anna_Bildyug
 */
public class ConsoleMessenger implements Messenger
{

    @Override
    public void write(String message)
    {
        System.out.println(message);
    }

    @Override
    public String read()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = null;
        while (result == null)
        {
            try
            {
                result = br.readLine();
            }
            catch (IOException e)
            {
                write("Try again!");
            }
        }
        return result;
    }
}
