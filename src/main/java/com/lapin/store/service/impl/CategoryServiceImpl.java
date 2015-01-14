package com.lapin.store.service.impl;

import com.lapin.store.dao.CategoryDao;
import com.lapin.store.entity.Category;
import com.lapin.store.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public void saveCategory(Category category) {
        categoryDao.save(category);
    }

    @Override
    public void deleteCategory(Category category) {
        categoryDao.delete(category);
    }

    @Override
    public Category findCategoryById(int id) {
        return categoryDao.findById(id);
    }

    @Override
    public Collection<Category> findCategories() {
        return  categoryDao.findAll();
    }
}
