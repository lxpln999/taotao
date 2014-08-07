package com.mgbd.taotao.model;

import com.jfinal.plugin.activerecord.Model;

import java.util.List;

public class Product extends Model<Product>{

    public static  final Product dao = new Product();

    public List<Product> getHotProduct(){
        return dao.find("select * from product where status = 1 order by sellCount");
    }

}
