package com.imooc.miaosha.redis;

public class OrderKey extends BassPrefix {

    public OrderKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
}
