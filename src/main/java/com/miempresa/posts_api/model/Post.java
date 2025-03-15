package com.miempresa.posts_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "posts")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("audiencia")
    private Integer audiencia;

    @JsonProperty("ciudad")
    private String ciudad;

    @JsonProperty("comments")
    private Integer comments;

    @JsonProperty("content_type")
    private String contentType;

    @JsonProperty("created_at")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @JsonProperty("date")
    @Column(name = "date")
    private LocalDateTime date;

    @JsonProperty("edad")
    private String edad;

    @JsonProperty("gen")
    private String gen;

    @JsonProperty("interaccion")
    private Integer interaccion;

    @JsonProperty("is_reply")
    private Boolean isReply;

    @JsonProperty("is_rt")
    private Boolean isRt;

    @JsonProperty("lat")
    private Double lat;

    @JsonProperty("likes")
    private Integer likes;

    @JsonProperty("link")
    @Column(length = 1000) // Para permitir URLs largas
    private String link;

    @JsonProperty("location")
    @Column(length = 500)
    private String location;

    @JsonProperty("lon")
    private Double lon;

    @JsonProperty("name")
    private String name;

    @JsonProperty("page_id")
    private String pageId;

    @JsonProperty("reply_to_id")
    private String replyToId;

    @JsonProperty("pais")
    private String pais;

    @JsonProperty("reactions")
    private Integer reactions;

    @JsonProperty("red")
    private Integer red;

    @JsonProperty("sector")
    private String sector;

    @JsonProperty("sentiment")
    private Integer sentiment;

    @JsonProperty("shares")
    private Integer shares;

    @JsonProperty("text")
    @Column(columnDefinition = "TEXT") // Puede contener mucho texto
    private String text;

    @JsonProperty("type")
    private String type;

    @JsonProperty("user_desc")
    @Column(columnDefinition = "TEXT") // Descripción de usuario puede ser larga
    private String userDesc;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("username")
    private String username;

    @JsonProperty("hashtags")
    @Column(columnDefinition = "TEXT") // Hashtags pueden ser largos
    private String hashtags;

    @JsonProperty("mentions")
    @Column(columnDefinition = "TEXT") // Muchas menciones posibles
    private String mentions;

    @JsonProperty("media")
    @Column(columnDefinition = "TEXT") // URLs de imágenes pueden ser largas
    private String media;

    @JsonProperty("concepts")
    @Column(columnDefinition = "TEXT") // Conceptos pueden ser listas largas
    private String concepts;

    @JsonProperty("followers")
    private Integer followers;

    @JsonProperty("friends")
    private Integer friends;

    @JsonProperty("status")
    private String status;

    @JsonProperty("ranking")
    private Integer ranking;

    @JsonProperty("lang")
    private String lang;

    @JsonProperty("views")
    private Integer views;
}