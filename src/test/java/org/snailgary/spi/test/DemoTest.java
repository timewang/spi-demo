package org.snailgary.spi.test;

import org.junit.Test;
import org.snailgary.spi.demo.Robot;

import java.util.ServiceLoader;

/**
 * @Author: timewang
 * @Date: 2019/12/3 11:28
 */
public class DemoTest {

    @Test
    public void sayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }

}
