package com.mgbd.taotao.model;

import com.jfinal.plugin.activerecord.Model;

import java.util.List;

public class Catalog extends Model<Catalog> {

    public static final Catalog dao = new Catalog();

    public void addCatalog(Catalog catalog) {
        catalog.save();
    }

    public void deleteCatalogById(int id) {
        Catalog.dao.deleteById(id);
    }

    public List<Catalog> getList() {
        return Catalog.dao.find("select * from catalog where showInNav = 1");
    }

}
