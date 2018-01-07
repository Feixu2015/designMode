package org.feixu.designpattern.chapter1.strategy.good;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Biminli
 * @version $Id: DecoyDuckTest.java, v 0.1 2018/1/8 Biminli Exp $$
 */
public class DecoyDuckTest {
    private static AbstractDuck duck;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("【小黄鸭测试】 start");
        duck = new DecoyDuck();
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("\n【小黄鸭测试】 end");
    }

    @Before
    public void before(){
        System.out.println();
    }

    @Test
    public void display() throws Exception {
        System.out.println("方法:" + Thread.currentThread().getStackTrace()[1].getMethodName());
        duck.display();
    }

    @Test
    public void swim() {
        System.out.println("方法:" + Thread.currentThread().getStackTrace()[1].getMethodName());
        duck.swim();
    }

    @Test
    public void performQuack() throws Exception {
        System.out.println("方法:" + Thread.currentThread().getStackTrace()[1].getMethodName());
        duck.performQuack();
    }

    @Test
    public void performFly() throws Exception {
        System.out.println("方法:" + Thread.currentThread().getStackTrace()[1].getMethodName());
        duck.performFly();
    }
}