package com.lapin.store.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tag", schema = "", catalog = "store")
public class Tag {

    private int id;

    private String name;

    private List<Goods> goods;
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tag tagEntity = (Tag) o;

        if (id != tagEntity.id) return false;
        if (name != null ? !name.equals(tagEntity.name) : tagEntity.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
    @ManyToMany
    @JoinTable(name="tag_to_goods", joinColumns = {@JoinColumn(name = "tag_id")},
            inverseJoinColumns = @JoinColumn(name = "goods_id"))
    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
}
