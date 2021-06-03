package com.autel.order.bean;

/**
 * 给前台发送的信息
 *
 * @param <T>
 */
public class PurchasesInfo<T> {
    private T Data; //后台给前台的数据
    private String Message; //后台给前台的信息

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public PurchasesInfo(T data, String message) {
        Data = data;
        Message = message;
    }
    public PurchasesInfo() {

    }

    @Override
    public String toString() {
        return "PurchasesInfo{" +
                "Data=" + Data +
                ", Message='" + Message + '\'' +
                '}';
    }
}
