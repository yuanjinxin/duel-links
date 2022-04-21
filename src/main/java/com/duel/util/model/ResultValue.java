package com.duel.util.model;

import java.io.Serializable;

public class ResultValue<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private String message;
    private boolean success;
    private T data;

    public ResultValue(T data, boolean success, String message) {
        this.data = data;
        this.success = success;
        this.message = message;
    }

    public ResultValue(T data) {
        this.data = data;
        this.success = true;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
