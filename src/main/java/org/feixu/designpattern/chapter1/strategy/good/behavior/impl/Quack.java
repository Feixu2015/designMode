/**
 * 杭州云霁科技有限公司
 * http://www.idcos.com
 * Copyright (c) 2017 All Rights Reserved.
 */
package org.feixu.designpattern.chapter1.strategy.good.behavior.impl;

import org.feixu.designpattern.chapter1.strategy.good.behavior.QuackBehavior;

/**
 * 呱呱叫
 *
 * @author Biminli
 * @version $Id: Quack.java, v 0.1 2018/1/8 Biminli Exp $$
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我会呱呱叫");
    }
}
