package com.lapin.store.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Denys Lapin on 02.11.2014.
 */
@Entity
@Table(name = "goods", schema = "", catalog = "store")
public class Goods {

    private int id;

    private String name;

    private String description;

    private Set<Feature> features = new HashSet<Feature>();

    private Category category;

    private Set<Tag> tags = new HashSet<Tag>();

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

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToMany
    @JoinTable(name = "value", joinColumns = { @JoinColumn(name = "goods_id") },
            inverseJoinColumns = { @JoinColumn(name = "feature_id") })
    public Set<Feature> getFeatures() { return features; }

    public void setFeatures(Set<Feature> features) { this.features = features; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods that = (Goods) o;

        if (id != that.id) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name="category_id")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToMany(mappedBy = "goods")
    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
}
