package com.mgbd.taotao.route;

import com.jfinal.config.Routes;
import com.mgbd.taotao.controller.IndexController;
import com.mgbd.taotao.web.controller.WebCatalogController;
import com.mgbd.taotao.web.controller.WebProductController;

public class WebRoute extends Routes{

    @Override
    public void config() {
        add("/", IndexController.class);
        add("webCatalog", WebCatalogController.class);
        add("webProduct", WebProductController.class);
    }
}
