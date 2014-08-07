package com.mgbd.taotao.admin.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.mgbd.taotao.common.Response;
import com.mgbd.taotao.common.ResponseCode;
import com.mgbd.taotao.model.Catalog;

public class AdminCatalogController extends Controller{

    @ActionKey("/manage/catalog")
    public void catalog() {
        String method = super.getRequest().getMethod();
        Catalog catalog = getModel(Catalog.class);
        if ("DELETE".equalsIgnoreCase(method)) {
            int id = getParaToInt("catalogId");
            catalog.deleteCatalogById(id);
        } else if ("POST".equalsIgnoreCase(method)) {
            String name = getPara("name");
            String code = getPara("code");
            int pid = getParaToInt("pid");
            String title = getPara("title");
            int order = getParaToInt("order");
            int showInNav = getParaToInt("showInNav");
            catalog.set("name", name).set("code", code).set("pid", pid).set("title", title).set("order", order)
                    .set("showInNav", showInNav);
            catalog.addCatalog(catalog);
        }
        renderJson(new Response(ResponseCode.SUCCESS));
    }
}
