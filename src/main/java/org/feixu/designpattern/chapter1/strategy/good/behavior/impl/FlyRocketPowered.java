/**
 * 杭州云霁科技有限公司
 * http://www.idcos.com
 * Copyright (c) 2017 All Rights Reserved.
 */
package org.feixu.designpattern.chapter1.strategy.good.behavior.impl;

import org.feixu.designpattern.chapter1.strategy.good.behavior.FlyBehavior;

/**
 * 火箭动力飞行
 *
 * @author Biminli
 * @version $Id: FlyRocketPowered.java, v 0.1 2018/1/8 Biminli Exp $$
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我是火箭动力飞行的");
    }
}
