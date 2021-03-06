package com.moviesservice.media.Entities;


import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "media")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String  id;


    private String title;
    private String description;
    private String type;

    @NotNull
    @Range(min = 1, max = 5)
    private Integer recommendation;
    private String flag;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "user_id", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnore
//    private User user;


    public Media(String title, String description, String type, @NotNull @Range(min = 1, max = 5) Integer recommendation, String flag, User user) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.recommendation = recommendation;
        this.flag = flag;
//        this.user = user;
    }

    protected Media (){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Integer recommendation) {
        this.recommendation = recommendation;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
}