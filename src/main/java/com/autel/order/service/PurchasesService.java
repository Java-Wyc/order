package com.autel.order.service;

import com.autel.order.bean.Purchases;

import java.util.List;

public interface PurchasesService {
    /**
     * 查询所有订单
     *
     * @return
     */
    List<Purchases> PurchasesList();

    /**
     * 添加订单
     *
     * @param purchases
     * @return
     */
    int AddPurchases(Purchases purchases);

    /**
     * 修改订单
     *
     * @param purchases
     * @return
     */
    int UpdatePurchases(Purchases purchases);

    /**
     * 删除订单
     *
     * @param purchases
     * @return
     */
    int DeletePurchases(Purchases purchases);

    /**
     * 根据姓名查询订单
     *
     * @param name
     * @return
     */
    List<Purchases> SelectPurchaseByName(String name);

}
