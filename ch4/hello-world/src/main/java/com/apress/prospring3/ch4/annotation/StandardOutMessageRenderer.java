package com.apress.prospring3.ch4.annotation;

import com.apress.prospring3.ch4.MessageProvider;
import com.apress.prospring3.ch4.MessageRenderer;
import org.springframework.stereotype.Service;

@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider = null;

    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class:"
                    + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

}
