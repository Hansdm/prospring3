package com.apress.prospring3.ch4.mi;

public abstract class AbstractLookupDemoBean implements DemoBean {
    @Override
    public abstract MyHelper getMyHelper();

    @Override
    public void someOperation() {
        getMyHelper().doSomethingHelpful();
    }
}
