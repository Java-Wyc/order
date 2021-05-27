package com.autel.order.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 订单模板
 */
public class Purchases {
    private Integer customer_id;//客户编号
    private String customer_name;//客户姓名
    private Integer product_id;//商品编号
    private String product_name;//商品名称
    private Double price;//商品价格
    private Integer quantity;//购买数量
    @JsonFormat( pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;//消费时间

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Purchases(Integer customer_id, String customer_name, Integer product_id, String product_name, Double price, Integer quantity, Date date) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Purchases{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                ", product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", date=" + date +
                '}';
    }
}
