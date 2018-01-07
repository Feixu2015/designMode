package org.feixu.designpattern.chapter1.strategy.notgood;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Biminli
 * @version $Id: BlackDuckTest.java, v 0.1 2018/1/7 Biminli Exp $$
 */
public class BlackDuckTest {
    private static Duck duck;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("【黑鸭测试】 start");
        duck = new BlackDuck();
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("\n【黑鸭测试】 end");
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

}