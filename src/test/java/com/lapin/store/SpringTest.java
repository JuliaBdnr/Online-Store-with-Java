package com.lapin.store;

import com.lapin.store.dao.CategoryDao;
import com.lapin.store.entity.Category;
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
@ContextConfiguration(locations = "/AppConfig.xml")
@ComponentScan(basePackages = "com.lapin.store.dao")
@Transactional
public class SpringTest {
    @Autowired
    CategoryDao categoryDao;
    @Test
    public void findAll(){
        int count = 0;
        List<Category> list = categoryDao.findAll();

        Assert.assertNotNull(list);
    }

}
