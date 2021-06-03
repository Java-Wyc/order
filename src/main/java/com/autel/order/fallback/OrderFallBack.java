package com.autel.order.fallback;

import com.autel.order.bean.Purchases;
import com.autel.order.bean.PurchasesInfo;
import com.autel.order.fiegn.OrderFeignClient;
import org.springframework.stereotype.Component;

@Component
public class OrderFallBack implements OrderFeignClient {
    @Override
    public PurchasesInfo SeletPur() {
        return new PurchasesInfo(null,"查询所有订单出错了");
    }

    @Override
    public PurchasesInfo AddPur(Purchases purchases) {
        return new PurchasesInfo(null,"添加订单出错了");
    }

    @Override
    public PurchasesInfo UpdataPur(Purchases purchases) {
        return new PurchasesInfo(null,"修改订单出错了");
    }

    @Override
    public PurchasesInfo DeletePur(Purchases purchases) {
        return new PurchasesInfo(null,"删除订单出错了");
    }
}
