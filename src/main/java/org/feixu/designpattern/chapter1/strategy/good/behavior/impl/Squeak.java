/**
 * 杭州云霁科技有限公司
 * http://www.idcos.com
 * Copyright (c) 2017 All Rights Reserved.
 */
package org.feixu.designpattern.chapter1.strategy.good.behavior.impl;

import org.feixu.designpattern.chapter1.strategy.good.behavior.QuackBehavior;

/**
 * 吱吱叫
 *
 * @author Biminli
 * @version $Id: Squeak.java, v 0.1 2018/1/8 Biminli Exp $$
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我会吱吱叫");
    }
}
