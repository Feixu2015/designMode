package org.feixu.designpattern.chapter1.strategy.good;

import org.feixu.designpattern.chapter1.strategy.good.behavior.impl.FlyRocketPowered;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Biminli
 * @version $Id: ModelDuckTest.java, v 0.1 2018/1/8 Biminli Exp $$
 */
public class ModelDuckTest {
    @Test
    public void dynamicChangeBehavior() {
        AbstractDuck duck = new ModelDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        System.out.println("\n---我是分割线---");
        System.out.println(">>>Duang! 赋予模型鸭飞行能力\n");
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }
}