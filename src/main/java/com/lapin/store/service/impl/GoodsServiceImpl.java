package com.lapin.store.service.impl;

import com.lapin.store.dao.GoodsDao;
import com.lapin.store.entity.Goods;
import com.lapin.store.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public void saveGoods(Goods goods) {
        goodsDao.save(goods);
    }

    @Override
    public void deleteGoods(Goods goods) {
        goodsDao.delete(goods);
    }

    @Override
    public Goods findGoodsById(int id) {
        return goodsDao.findById(id);
    }

    @Override
    public Collection<Goods> findGoods() {
        return goodsDao.findAll();
    }
}
