/**
 * 杭州云霁科技有限公司
 * http://www.idcos.com
 * Copyright (c) 2017 All Rights Reserved.
 */
package org.feixu.designpattern.chapter1.strategy.good.behavior.impl;

import org.feixu.designpattern.chapter1.strategy.good.behavior.QuackBehavior;

/**
 * 沉默
 *
 * @author Biminli
 * @version $Id: MuteQuack.java, v 0.1 2018/1/8 Biminli Exp $$
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        // 我可不会叫
    }
}
