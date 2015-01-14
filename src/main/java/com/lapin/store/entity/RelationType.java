package com.lapin.store.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "relation_type", schema = "", catalog = "store")
public class RelationType {

    private int id;

    private String name;

    private Set<RelationGoods> relationGoods;

    @Id
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



    @OneToMany(mappedBy = "relationType")
    public Set<RelationGoods> getRelationGoods() {
        return relationGoods;
    }

    public void setRelationGoods(Set<RelationGoods> relationGoods) {
        this.relationGoods = relationGoods;
    }
}
