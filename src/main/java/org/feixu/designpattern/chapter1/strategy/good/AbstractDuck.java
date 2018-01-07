/**
 * 杭州云霁科技有限公司
 * http://www.idcos.com
 * Copyright (c) 2017 All Rights Reserved.
 */
package org.feixu.designpattern.chapter1.strategy.good;

import org.feixu.designpattern.chapter1.strategy.good.behavior.FlyBehavior;
import org.feixu.designpattern.chapter1.strategy.good.behavior.QuackBehavior;
import org.springframework.util.Assert;

/**
 * 鸭子基类
 *
 * @author Biminli
 * @version $Id: AbstractDuck.java, v 0.1 2018/1/7 Biminli Exp $$
 */
public abstract class AbstractDuck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("我天生会游泳");
    }

    /**
     * 显示鸭子，子类必须覆盖
     */
    public abstract void display();

    public void performQuack(){
        Assert.notNull(quackBehavior, "未初始化QuackBehavior");
        quackBehavior.quack();
    }

    public void performFly(){
        Assert.notNull(flyBehavior, "未初始化FlyBehavior");
        flyBehavior.fly();
    }

    /**
     * 运行时可改变鸭子的飞行行为
     *
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    /**
     * 运行时可改变鸭子的叫声行为
     *
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
