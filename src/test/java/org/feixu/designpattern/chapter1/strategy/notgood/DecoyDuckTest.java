package org.feixu.designpattern.chapter1.strategy.notgood;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Biminli
 * @version $Id: DecoyDuckTest.java, v 0.1 2018/1/7 Biminli Exp $$
 */
public class DecoyDuckTest {
    private static Duck duck;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("【诱饵鸭测试】 start");
        duck = new DecoyDuck();
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("\n【诱饵鸭测试】 end");
    }

    @Before
    public void before(){
        System.out.println();
    }

    @Test
    public void quack() throws Exception {
    }

    @Test
    public void display() throws Exception {
    }

    @Test
    public void fly() throws Exception {
    }

}