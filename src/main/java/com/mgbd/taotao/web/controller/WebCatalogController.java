package com.mgbd.taotao.web.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.mgbd.taotao.common.Response;
import com.mgbd.taotao.common.ResponseCode;
import com.mgbd.taotao.model.Catalog;

import java.util.List;

public class WebCatalogController extends Controller {

    @ActionKey("/1/catalogs")
    public void catalogs() {
        Catalog catalog = getModel(Catalog.class);
        List<Catalog> catalogList = catalog.getList();
        renderJson(new Response(ResponseCode.SUCCESS, catalogList));
    }
}
