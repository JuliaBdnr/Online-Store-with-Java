package com.lapin.store.entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by Denys Lapin on 02.11.2014.
 */
@Embeddable
public class RelationGoodsPK implements Serializable {

    private Goods firstGoods;

    private Goods secondGoods;

    @ManyToOne
    public Goods getFirstGoods() {
        return firstGoods;
    }

    public void setFirstGoods(Goods firstGoods) {
        this.firstGoods = firstGoods;
    }
    @ManyToOne
    public Goods getSecondGoods() {
        return secondGoods;
    }

    public void setSecondGoods(Goods secondGoods) {
        this.secondGoods = secondGoods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RelationGoodsPK that = (RelationGoodsPK) o;

        if (firstGoods != null ? !firstGoods.equals(that.firstGoods) : that.firstGoods != null) return false;
        if (secondGoods != null ? !secondGoods.equals(that.secondGoods) : that.secondGoods != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (firstGoods != null ? firstGoods.hashCode() : 0);
        result = 31 * result + (secondGoods != null ? secondGoods.hashCode() : 0);
        return result;
    }

}
