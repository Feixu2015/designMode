/**
 * 杭州云霁科技有限公司
 * http://www.idcos.com
 * Copyright (c) 2017 All Rights Reserved.
 */
package org.feixu.designpattern.chapter1.strategy.good.behavior.impl;

import org.feixu.designpattern.chapter1.strategy.good.behavior.FlyBehavior;

/**
 * 不会飞
 *
 * @author Biminli
 * @version $Id: FlyNoWay.java, v 0.1 2018/1/8 Biminli Exp $$
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        // 我不会飞，所以我啥都不干
    }
}
