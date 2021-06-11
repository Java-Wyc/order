package com.autel.order.controller;

import com.autel.order.bean.Purchases;
import com.autel.order.bean.PurchasesInfo;
import com.autel.order.service.PurchasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 控制层
 */
@Controller
@RequestMapping("/order")
public class PurchasesController {
    @Autowired
    private PurchasesService purchasesService;

    /**
     * 查询到的订单
     *
     * @return
     */
    @RequestMapping("/selectList")
    @ResponseBody
    public PurchasesInfo SeletPur() {
        PurchasesInfo purchasesInfo = new PurchasesInfo<>();
        purchasesInfo.setData(purchasesService.PurchasesList());
        purchasesInfo.setMessage("查询成功");
        return purchasesInfo;
    }

    /**
     * 添加订单
     *
     * @param purchases
     * @return
     */
    @ResponseBody
    @RequestMapping("/add")
    public PurchasesInfo AddPur(Purchases purchases) {
        PurchasesInfo purchasesInfo = new PurchasesInfo();
        int row = purchasesService.AddPurchases(purchases);
        if (row > 0) {
            purchasesInfo.setData(purchasesService.PurchasesList());
            purchasesInfo.setMessage("添加成功");
            return purchasesInfo;
        }
        purchasesInfo.setData(purchasesService.PurchasesList());
        purchasesInfo.setMessage("添加失败");
        return purchasesInfo;
    }

    /**
     * 修改订单
     *
     * @param purchases
     * @return
     */
    @ResponseBody
    @RequestMapping("/updata")
    public PurchasesInfo UpadataPur(Purchases purchases) {
        PurchasesInfo purchasesInfo = new PurchasesInfo();
        int row = purchasesService.UpdatePurchases(purchases);
        if (row > 0) {
            purchasesInfo.setData(purchasesService.PurchasesList());
            purchasesInfo.setMessage("修改成功");
            return purchasesInfo;
        }
        purchasesInfo.setData(purchasesService.PurchasesList());
        purchasesInfo.setMessage("修改失败");
        return purchasesInfo;
    }

    /**
     * 删除订单
     *
     * @param purchases
     * @return
     */
    @ResponseBody
    @RequestMapping("/delete")
    public PurchasesInfo DeletePur(Purchases purchases) {
        PurchasesInfo purchasesInfo = new PurchasesInfo();
        int row = purchasesService.DeletePurchases(purchases);
        if (row > 0) {
            purchasesInfo.setData(purchasesService.PurchasesList());
            purchasesInfo.setMessage("删除成功");
            return purchasesInfo;
        }
        purchasesInfo.setData(purchasesService.PurchasesList());
        purchasesInfo.setMessage("删除失败");
        return purchasesInfo;
    }

    /**
     * 根据姓名查询订单
     *
     * @param name
     * @return
     */
    @RequestMapping("/selectOne")
    @ResponseBody
    public PurchasesInfo SelectPurchaseByName(String name) {
        PurchasesInfo purchasesInfo = new PurchasesInfo();
        if (purchasesService.SelectPurchaseByName(name) != null) {
            purchasesInfo.setData(purchasesService.SelectPurchaseByName(name));
            purchasesInfo.setMessage("查询成功");
            return purchasesInfo;
        }
        purchasesInfo.setData(purchasesService.PurchasesList());
        purchasesInfo.setMessage("没有此人的订单");
        return purchasesInfo;
    }


}
