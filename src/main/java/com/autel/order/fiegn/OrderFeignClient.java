package com.autel.order.fiegn;

import com.autel.order.bean.Purchases;
import com.autel.order.bean.PurchasesInfo;
import com.autel.order.fallback.OrderFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "orderclient",fallback = OrderFallBack.class)
public interface OrderFeignClient {
    @RequestMapping("/selectList")
    PurchasesInfo SeletPur();

    @RequestMapping("/add")
    PurchasesInfo AddPur(Purchases purchases);

    @RequestMapping("/updata")
    PurchasesInfo UpdataPur(Purchases purchases);

    @RequestMapping("/delete")
    PurchasesInfo DeletePur(Purchases purchases);
}
