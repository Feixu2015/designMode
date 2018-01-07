/**
 * 杭州云霁科技有限公司
 * http://www.idcos.com
 * Copyright (c) 2017 All Rights Reserved.
 */
package org.feixu.designpattern.chapter1.strategy.notgood;

/**
 * 小黄鸭
 * 
 * @author Biminli
 * @version $Id: RubberDuck.java, v 0.1 2018/1/7 Biminli Exp $$
 */
public class RubberDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    public void display() {
        System.out.println("我是小黄鸭");
    }
}
