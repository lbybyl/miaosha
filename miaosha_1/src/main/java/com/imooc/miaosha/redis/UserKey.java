package com.imooc.miaosha.redis;

public class UserKey extends BassPrefix {


    private UserKey(String prefix) {
        super(prefix);
    }

    public static UserKey getById=new UserKey("id");
    public static UserKey getByName=new UserKey("name");
}
