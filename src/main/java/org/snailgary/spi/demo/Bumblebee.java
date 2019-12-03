package org.snailgary.spi.demo;

/**
 * @Author: timewang
 * @Date: 2019/12/3 11:24
 */
public class Bumblebee implements Robot {

    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }
}
