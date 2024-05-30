package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "comments")
public class Comment {
    @Id
    private String commentId;
    private String userId;
    private String videoId;
    private String commentText;
    private LocalDateTime dateCommented;

    
    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public LocalDateTime getDateCommented() {
        return dateCommented;
    }

    public void setDateCommented(LocalDateTime dateCommented) {
        this.dateCommented = dateCommented;
    }
}
