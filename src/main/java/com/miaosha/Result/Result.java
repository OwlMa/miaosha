package com.miaosha.Result;

import com.miaosha.Code.Code;
import com.miaosha.Code.LoginCode;

public class Result<T> {
    public static void main(String[] args) {
    }

    private String message;
    private Integer code;
    private T data;

    public static Result<Boolean> error(Code code) {
        return new Result<Boolean>(code.getMessage(), code.getCode(), false);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result(String message, Integer code, T data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }
}
