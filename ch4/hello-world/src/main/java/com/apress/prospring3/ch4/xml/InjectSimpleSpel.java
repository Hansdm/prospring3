package com.apress.prospring3.ch4.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimpleSpel {

    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-spel-xml.xml");
        ctx.refresh();
        InjectSimpleSpel simple = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
        System.out.println(simple);
    }

    public String toString() {
        return "Name :" + name + "\n"
                + "Age:" + age + "\n"
                + "Age in Seconds: " + ageInSeconds + "\n"
                + "Height: " + height + "\n"
                + "Is Programmer?: " + programmer;
    }
}
