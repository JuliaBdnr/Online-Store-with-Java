package com.lapin.store.service;

import com.lapin.store.entity.Category;

import java.util.Collection;

public interface CategoryService {
    public void saveCategory(Category category);
    public void deleteCategory(Category category);
    public Category findCategoryById(int id);
    public Collection<Category> findCategories();
}
