package com.mgbd.taotao.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller {

    public void index(){
        render("/web/index.html");
    }
}
