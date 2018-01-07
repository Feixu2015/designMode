/**
 * 杭州云霁科技有限公司
 * http://www.idcos.com
 * Copyright (c) 2017 All Rights Reserved.
 */
package org.feixu.designpattern.chapter1.strategy.notgood;

/**
 * 鸭子基类
 *
 * @author Biminli
 * @version $Id: Duck.java, v 0.1 2018/1/7 Biminli Exp $$
 */
public class Duck {
    public void quack() {
        System.out.println("呱呱叫");
    }

    public void swim() {
        System.out.println("我会游泳");
    }

    public void display(){
        System.out.println("我是Duck");
    }

    public void fly() {
        System.out.println("我会飞");
    }
}
