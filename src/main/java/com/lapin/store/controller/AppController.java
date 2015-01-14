package com.lapin.store.controller;

import com.lapin.store.entity.Category;
import com.lapin.store.entity.Goods;
import com.lapin.store.service.CategoryService;
import com.lapin.store.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class AppController {

    private CategoryService categoryService;

    private GoodsService goodsService;
    @Autowired
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }
    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @RequestMapping("/")
    public String getJsp(ModelMap model){
        Collection<Category> list = categoryService.findCategories();
        Collection<Goods> goodsList = goodsService.findGoods();
        model.addAttribute("categories", list);
        model.addAttribute("goods", goodsList);
        return "index";
    }
}
