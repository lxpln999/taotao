package com.mgbd.taotao.controller;

import com.jfinal.core.Controller;

public class AdminIndexController extends Controller{

    public void index(){
        render("/html/index.html");
    }

}
