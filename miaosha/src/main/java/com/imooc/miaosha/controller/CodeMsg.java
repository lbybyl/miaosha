package com.imooc.miaosha.controller;

public class CodeMsg {
    private int code;
    private String msg;

    public static CodeMsg SUCCESS = new CodeMsg(0, "success");
    public static CodeMsg  ERROR = new CodeMsg(500, "服务端异常");
    public static CodeMsg SESSION_ERROR = new CodeMsg(500111, "没有SESSION！");
    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
