package com.miaosha.Code;

public enum LoginCode implements Code {
    SESSION_ERROR(500210, "Session不存在或已失效"),
    PASSWORD_EMPTY(500511, "登录密码不能为空"),
    PHONE_EMPTY(500212, "手机号不能为空"),
    PHONE_FORMAT_ERROR(500513, "手机号码格式错误");

    private Integer code;
    private String message;
    @Override
    public Integer getCode() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }

    LoginCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
