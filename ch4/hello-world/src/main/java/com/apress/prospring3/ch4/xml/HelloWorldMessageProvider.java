package com.apress.prospring3.ch4.xml;

import com.apress.prospring3.ch4.*;

public class HelloWorldMessageProvider implements MessageProvider {

    public String getMessage() {
        return "Hello World!";
    }

}
