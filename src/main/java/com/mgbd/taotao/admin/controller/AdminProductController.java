package com.mgbd.taotao.admin.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.mgbd.taotao.common.Response;
import com.mgbd.taotao.common.ResponseCode;
import com.mgbd.taotao.model.Product;

public class AdminProductController extends Controller{

    @ActionKey("/manage/product")
    public void product() {
        int catalogId = getParaToInt("catalogId");
        String name = getPara("name");
        String introduce = getPara("introduce");
        String price = getPara("price");
        String nowPrice = getPara("nowPrice");
        String picture = getPara("picture");
        int isNew = getParaToInt("isNew");
        int idSale = getParaToInt("idSale");
        int activityId = getParaToInt("activityId");
        int giftId = getParaToInt("giftId");
        int hit = getParaToInt("hit");
        int isTimePromotion = getParaToInt("isTimePromotion");
        int status = getParaToInt("status");
        String productHtml = getPara("productHtml");
        String searchKey = getPara("searchKey");
        String title = getPara("title");
        String description = getPara("description");
        String keywords = getPara("keywords");
        String createTime = getPara("createTime");
        int sellCount = getParaToInt("sellCount");
        int stock = getParaToInt("stock");
        Product product = getModel(Product.class);
        product.set("catalogId", catalogId).set("name", name)
                .set("introduce", introduce).set("price", price).set("nowPrice", nowPrice)
                .set("picture", picture).set("isNew", isNew).set("idSale", idSale).set("activityId", activityId)
                .set("giftId", giftId).set("hit", hit).set("isTimePromotion", isTimePromotion).set("status", status)
                .set("productHtml", productHtml).set("searchKey", searchKey).set("title", title)
                .set("description", description).set("keywords", keywords).set("createTime", createTime)
                .set("sellCount", sellCount).set("stock", stock).save();
        renderJson(new Response(ResponseCode.SUCCESS));
    }
}
