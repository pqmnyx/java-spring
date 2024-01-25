package com.db.models;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Table(name = "phrases")
@Entity
public class Phrases {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_phrases;
    private String phrase;
    private String meaning;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_dialects", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Dialects dialects;

    public Phrases(){

    }

    public Phrases(String phrase, String meaning, Dialects dialect) {
        this.setPhrase(phrase);
        this.setMeaning(meaning);
        this.setDialect(dialects);
    }

    private void setMeaning(String meaning) {this.meaning = meaning; }
    public String getMeaning() {
        return meaning;
    }

    public int getId() {
        return id_phrases;
    }

    public String getPhrase() {
        return phrase;
    }
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public Dialects getDialects() {
        return dialects;
    }
    public void setDialect(Dialects dialects) {
        this.dialects = dialects;
    }

}
