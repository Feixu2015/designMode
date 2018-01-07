/**
 * 杭州云霁科技有限公司
 * http://www.idcos.com
 * Copyright (c) 2017 All Rights Reserved.
 */
package org.feixu.designpattern.chapter1.strategy.good;

import org.feixu.designpattern.chapter1.strategy.good.behavior.impl.FlyWithWings;
import org.feixu.designpattern.chapter1.strategy.good.behavior.impl.Quack;

/**
 * 黑鸭
 *
 * @author Biminli
 * @version $Id: BlackDuck.java, v 0.1 2018/1/7 Biminli Exp $$
 */
public class BlackDuck extends AbstractDuck {

    public BlackDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是黑鸭");
    }
}
