package com.web.webapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Article(){

    }

    public Article(String title, String anons, String fullText){
        this.title = title;
        this.anons = anons;
        this.fullText = fullText;
    }

    private String title, anons, fullText;
    private int views;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAnons() {
        return anons;
    }

    public String getFullText() {
        return fullText;
    }

    public int getViews() {
        return views;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public void setViews(int views) {
        this.views = views;
    }


}
