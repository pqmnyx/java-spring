package com.db.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Table(name = "regions")
@Entity
public class Regions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_regions;
    private String region;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "dialects_to_regions",
            joinColumns = {@JoinColumn(name = "id_regions", referencedColumnName = "id_regions")},
            inverseJoinColumns = {@JoinColumn(name = "id_dialects", referencedColumnName = "id_dialects")})
    private Set<Dialects> dialects = new HashSet<>();


    public Regions(String region) {
        this.setRegion(region);
    }

    public Regions(String region, Set<Dialects>  dialects) {
        this.setRegion(region);
        this.setDialects(dialects);
    }

    public int getId() {
        return id_regions;
    }
    public Set<Dialects>  getDialects() {
        return dialects;
    }

    public void setDialects(Set<Dialects>  dialects) {
        this.dialects = dialects;
    }

    private void setRegion(String region) {this.region = region; }
    public String getRegion() {
        return region;
    }

}
