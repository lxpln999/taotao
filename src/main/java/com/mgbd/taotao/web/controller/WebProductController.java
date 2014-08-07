package com.mgbd.taotao.web.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.mgbd.taotao.common.Response;
import com.mgbd.taotao.common.ResponseCode;
import com.mgbd.taotao.model.Product;

import java.io.IOException;
import java.util.List;

public class WebProductController extends Controller{

    @ActionKey("/1/products")
    public void products() {
        Product product = getModel(Product.class);
        List<Product> list = product.getHotProduct();
        renderJson(new Response(ResponseCode.SUCCESS, list));
    }

    @ActionKey("/1/product/detail")
    public void detail() throws IOException {
        int id = getParaToInt(0);
        Product product = getModel(Product.class);
        Product productInfo = product.findById(id);
        renderJson(new Response(ResponseCode.SUCCESS, productInfo));
    }

}
