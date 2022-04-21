package com.duel.common.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    // 返回数据
    private T data;
    // 返回结果
    private boolean flag = true;
    // 描述
    private String message;

    private Result(T data) {
        this.data = data;
    }

    public static <T> Result<T> of(T data, boolean flag) {
        return new Result<>(data, flag);
    }

    private Result(T data, boolean flag) {
        this.data = data;
        this.flag = flag;
    }

    private Result(T data, boolean flag, String msg) {
        this.data = data;
        this.flag = flag;
        this.message = msg;
    }

}
