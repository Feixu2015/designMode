/**
 * 杭州云霁科技有限公司
 * http://www.idcos.com
 * Copyright (c) 2017 All Rights Reserved.
 */
package org.feixu.designpattern.chapter1.strategy.good;

import org.feixu.designpattern.chapter1.strategy.good.behavior.impl.FlyNoWay;
import org.feixu.designpattern.chapter1.strategy.good.behavior.impl.Quack;

/**
 * 模型鸭
 *
 * @author Biminli
 * @version $Id: ModelDuck.java, v 0.1 2018/1/8 Biminli Exp $$
 */
public class ModelDuck extends AbstractDuck {

    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("我是模型鸭");
    }
}
