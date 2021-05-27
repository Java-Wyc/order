package com.autel.order.service.serviceimpl;

import com.autel.order.bean.Purchases;
import com.autel.order.dao.PurchasesDao;
import com.autel.order.service.PurchasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PurchasesServiceImpl implements PurchasesService {
    @Autowired
    private PurchasesDao purchasesDao;

    /**
     * 查询订单
     * @return
     */
    @Override
    public List<Purchases> PurchasesList() {
        return purchasesDao.SelectPurchases();
    }

    /**
     * 添加订单
     * @param purchases
     * @return
     */
    @Override
    public int AddPurchases(Purchases purchases) {
        return purchasesDao.AddPurchases(purchases);
    }

    /**
     * 修改订单
     * @param purchases
     * @return
     */
    @Override
    public int UpdatePurchases(Purchases purchases) {
        return purchasesDao.UpdatePurchases(purchases);
    }

    /**
     * 删除订单
     * @param purchases
     * @return
     */
    @Override
    public int DeletePurchases(Purchases purchases) {
        return purchasesDao.DeletePurchases(purchases);
    }

    /**
     * 根据姓名查询订单
     * @param name
     * @return
     */
    @Override
    public List<Purchases> SelectPurchaseByName(String name) {
        return purchasesDao.SelectPurchaseByName(name);
    }

}
