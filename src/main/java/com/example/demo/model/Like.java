package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "likes")
public class Like {
    @Id
    private String likeId;
    private String userId;
    private String videoId;
    private LocalDateTime dateLiked;

    
    public String getLikeId() {
        return likeId;
    }

    public void setLikeId(String likeId) {
        this.likeId = likeId;
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

    public LocalDateTime getDateLiked() {
        return dateLiked;
    }

    public void setDateLiked(LocalDateTime dateLiked) {
        this.dateLiked = dateLiked;
    }
}
