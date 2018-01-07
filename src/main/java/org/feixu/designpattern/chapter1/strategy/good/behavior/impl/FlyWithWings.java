/**
 * 杭州云霁科技有限公司
 * http://www.idcos.com
 * Copyright (c) 2017 All Rights Reserved.
 */
package org.feixu.designpattern.chapter1.strategy.good.behavior.impl;

import org.feixu.designpattern.chapter1.strategy.good.behavior.FlyBehavior;

/**
 * 用翅膀飞的实现
 *
 * @author Biminli
 * @version $Id: FlyWithWings.java, v 0.1 2018/1/8 Biminli Exp $$
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我可以飞哦");
    }
}
