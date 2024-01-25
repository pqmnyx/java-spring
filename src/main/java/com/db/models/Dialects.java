package com.db.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Table(name = "dialects")
@Entity
public class Dialects {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_dialects")
    private Integer id_dialects;
    private String name;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }, mappedBy = "dialects")
    //@JsonIgnore
    private Set<Regions> regions = new HashSet<>();

    public Dialects() {
        setRegions(new HashSet<>());
    }

    public Dialects(String name, Set<Regions>  regions) {
        this.setName(name);
        this.setRegions(regions);
    }

    public int getId() {
        return id_dialects;
    }
    public Set<Regions>  getRegions() {
        return regions;
    }

    public void setRegions(Set<Regions>  regions) {
        this.regions = regions;
    }

    private void setName(String name) {this.name = name; }
    public String getName() {
        return name;
    }

}
