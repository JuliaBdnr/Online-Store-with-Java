package com.lapin.store.entity;

import javax.persistence.*;

/**
 * Created by Denys Lapin on 11.11.2014.
 */
@Entity
@Table(name = "value")
public class Value {
    private int value_id;
    private int feature_id;
    private int goods_id;
    private double value;
    @Id
    public int getValue_id() {
        return value_id;
    }

    public void setValue_id(int value_id) {
        this.value_id = value_id;
    }

    public int getFeature_id() {
        return feature_id;
    }

    public void setFeature_id(int feature_id) {
        this.feature_id = feature_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
