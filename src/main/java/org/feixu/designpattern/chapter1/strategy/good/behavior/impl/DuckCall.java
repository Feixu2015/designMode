/**
 * 杭州云霁科技有限公司
 * http://www.idcos.com
 * Copyright (c) 2017 All Rights Reserved.
 */
package org.feixu.designpattern.chapter1.strategy.good.behavior.impl;

import org.feixu.designpattern.chapter1.strategy.good.behavior.QuackBehavior;

/**
 * 鸭鸣器
 *
 * @author Biminli
 * @version $Id: DuckCall.java, v 0.1 2018/1/8 Biminli Exp $$
 */
public class DuckCall implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("模拟呱呱叫");
    }
}
