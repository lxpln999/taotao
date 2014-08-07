package com.mgbd.taotao.common;

/**
 * 响应码
 */
public enum ResponseCode {

    SUCCESS(0, "operate success"),

    FAILED(1, "operate failed"),

    //用户相关响应码
    USER_EXIST(1000, "user has already exist"),

    //产品相关响应码
    PRODUCT_EXIST(2000, "product has already exist");

    private int code;

    private String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
