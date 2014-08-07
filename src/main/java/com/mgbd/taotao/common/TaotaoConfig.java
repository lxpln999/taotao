package com.mgbd.taotao.common;

import com.jfinal.config.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import com.mgbd.taotao.controller.AdminIndexController;
import com.mgbd.taotao.controller.IndexController;
import com.mgbd.taotao.model.Catalog;
import com.mgbd.taotao.model.Product;
import com.mgbd.taotao.route.AdminRoute;
import com.mgbd.taotao.route.WebRoute;

public class TaotaoConfig extends JFinalConfig {

    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);
        constants.setViewType(ViewType.JSP);
    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/", IndexController.class);
        routes.add("/admin", AdminIndexController.class);
        routes.add(new AdminRoute());
        routes.add(new WebRoute());
    }

    @Override
    public void configPlugin(Plugins plugins) {
        C3p0Plugin c3p0Plugin = new C3p0Plugin("jdbc:mysql://localhost:3306/taotao", "taotao", "taotao");
        plugins.add(c3p0Plugin);
        ActiveRecordPlugin activeRecordPlugin = new ActiveRecordPlugin(c3p0Plugin);
        plugins.add(activeRecordPlugin);
        registManageModel(activeRecordPlugin);
    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }

    private void registManageModel(ActiveRecordPlugin activeRecordPlugin) {
        activeRecordPlugin.addMapping("catalog", Catalog.class);
        activeRecordPlugin.addMapping("product", Product.class);
    }
}
