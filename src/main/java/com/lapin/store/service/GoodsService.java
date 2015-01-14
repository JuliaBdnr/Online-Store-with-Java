package com.lapin.store.service;

import com.lapin.store.entity.Goods;

import java.util.Collection;

public interface GoodsService {
    public void saveGoods(Goods goods);
    public void deleteGoods(Goods goods);
    public Goods findGoodsById(int id);
    public Collection<Goods> findGoods();
}
