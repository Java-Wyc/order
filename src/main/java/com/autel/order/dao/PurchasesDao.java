package com.autel.order.dao;

import com.autel.order.bean.Purchases;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PurchasesDao {
    /**
     * 查询所有订单
     *
     * @return
     */
    @Select("SELECT customer_id,customer_name,product_id,product_name,price,quantity,purchase_time FROM purchases")
    List<Purchases> SelectPurchases();

    /**
     * 添加一个订单
     *
     * @param purchases
     * @return
     */
    @Insert("insert into purchases(customer_id,customer_name,product_id,product_name,price,quantity,purchase_time)"
            + "values(#{customer_id},#{customer_name},#{product_id},#{product_name},#{price},#{quantity},#{date}")
    int AddPurchases(Purchases purchases);

    /**
     * 修改一个订单
     *
     * @param purchases
     * @return
     */
    @UpdateProvider(type = PurchasesProvider.class, method = "update")
    int UpdatePurchases(Purchases purchases);

    /**
     * 删除一个订单
     *
     * @param purchases
     * @return
     */
    @Delete("delete from purchases where customer_id = #{customer_id}")
    int DeletePurchases(Purchases purchases);

    /**
     * 根据姓名查询订单
     *
     * @param name
     * @return
     */
    @Select("SELECT customer_id,customer_name,product_id,product_name,price,quantity,purchase_time FROM purchases"
            + "where customer_name = #{name}")
    List<Purchases> SelectPurchaseByName(String name);

}
