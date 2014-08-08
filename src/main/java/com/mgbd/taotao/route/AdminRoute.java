package com.mgbd.taotao.route;

import com.jfinal.config.Routes;
import com.mgbd.taotao.admin.controller.AdminCatalogController;
import com.mgbd.taotao.admin.controller.AdminProductController;
import com.mgbd.taotao.controller.AdminIndexController;

public class AdminRoute extends Routes {

    @Override
    public void config() {
        add("/admin", AdminIndexController.class);
        add("adminProduct", AdminProductController.class);
        add("adminCatalog", AdminCatalogController.class);
    }
}
