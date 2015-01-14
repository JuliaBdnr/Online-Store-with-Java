package com.lapin.store;

import com.lapin.store.dao.CategoryDao;
import com.lapin.store.dao.GoodsDao;
import com.lapin.store.entity.Category;
import com.lapin.store.entity.Goods;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Denys Lapin on 16.11.2014.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/business-config.xml")
@ComponentScan(basePackages = "com.lapin.store.dao")
@Transactional
public class SpringTest {
    @Autowired
    CategoryDao categoryDao;
    @Autowired
    GoodsDao goodsDao;
    @Test
    public void findAll(){
        List<Category> list = categoryDao.findAll();
        Assert.assertNotNull(list);
        List<Goods> goodsList = goodsDao.findAll();
        Assert.assertNotNull(list);
    }

}
