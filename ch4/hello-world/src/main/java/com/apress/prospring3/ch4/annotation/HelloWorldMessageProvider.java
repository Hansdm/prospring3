package com.apress.prospring3.ch4.annotation;

import com.apress.prospring3.ch4.MessageProvider;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {

    public String getMessage() {
        return "Hello World!";
    }

}
