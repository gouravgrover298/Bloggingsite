
package com.example.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long postId; // ID of the associated blog post

    @Column(nullable = false)
    private int views; // Number of views

    @Column(nullable = false)
    private int comments; // Number of comments

    @Column(nullable = false)
    private int likes; // Number of likes

    @Column(nullable = false)
    private LocalDateTime createdAt; // Timestamp of when the report was created

    // Constructors
    public Report() {
        this.createdAt = LocalDateTime.now(); // Set the createdAt to the current time
    }

    public Report(Long postId, int views, int comments, int likes) {
        this.postId = postId;
        this.views = views;
        this.comments = comments;
        this.likes = likes;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}