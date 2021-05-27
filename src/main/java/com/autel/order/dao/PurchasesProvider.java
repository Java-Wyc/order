package com.autel.order.dao;

import com.autel.order.bean.Purchases;
import org.apache.ibatis.jdbc.SQL;

public class PurchasesProvider {
    public String update(Purchases purchases){
        return new SQL(){
            {
                UPDATE("purchases");
                if (purchases.getCustomer_id() != null && purchases.getCustomer_id().equals("") ){
                    SET("customer_id = #{customer_id}");
                }
                if (purchases.getCustomer_name() != null && purchases.getCustomer_name().equals("")){
                    SET("customer_name = #{customer_name");
                }
                if (purchases.getProduct_id() != null && purchases.getProduct_name().equals("")){
                    SET("product_id = #{product_id");
                }
                if (purchases.getProduct_name() != null && purchases.getProduct_name().equals("")){
                    SET("product_name = #{product_name}");
                }
                if (purchases.getPrice() != null && purchases.getPrice().equals("")){
                    SET("price = #{price}");
                }
                if (purchases.getQuantity() != null && purchases.getQuantity().equals("")){
                    SET("quantity = #{quantity}");
                }
                if (purchases.getDate() != null && purchases.getDate().equals("")){
                    SET("purchase_time = #{date}");
                }
            }

        }.toString();
    }
}
