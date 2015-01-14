package com.lapin.store.entity;

import javax.persistence.*;

@Entity
@Table(name = "relation_goods", schema = "", catalog = "store")
public class RelationGoods {

    private RelationGoodsPK relationGoodsPK = new RelationGoodsPK();

    private RelationType relationType;

    @EmbeddedId
    public RelationGoodsPK getRelationGoodsPK() {
        return relationGoodsPK;
    }

    public void setRelationGoodsPK(RelationGoodsPK relationGoodsPK) {
        this.relationGoodsPK = relationGoodsPK;
    }

    @ManyToOne
    @JoinColumn(name = "type_id")
    public RelationType getRelationType() {
        return relationType;
    }

    public void setRelationType(RelationType relationType) {
        this.relationType = relationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RelationGoods that = (RelationGoods) o;

        if (relationGoodsPK != null ? !relationGoodsPK.equals(that.relationGoodsPK) : that.relationGoodsPK != null) return false;
        if (relationType != null ? !relationType.equals(that.relationType) : that.relationType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (relationGoodsPK != null ? relationGoodsPK.hashCode() : 0);
        result = 31 * result + (relationType != null ? relationType.hashCode() : 0);
        return result;
    }
}
