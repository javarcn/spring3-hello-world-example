package com.javarcn;

/**
 * @author jiacheng
 * @created on 2017/8/4 11:35.
 */
public class HelloWorld {
    private String name;

    public void setName(String name){
        this.name=name;
    }

    public void printHello(){
        System.out.println("spring 3: hello ! "+name);
    }
}
