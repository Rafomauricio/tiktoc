package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "view_history")
public class ViewHistory {
    @Id
    private String viewId;
    private String userId;
    private String videoId;
    private LocalDateTime dateViewed;

    
    public String getViewId() {
        return viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
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

    public LocalDateTime getDateViewed() {
        return dateViewed;
    }

    public void setDateViewed(LocalDateTime dateViewed) {
        this.dateViewed = dateViewed;
    }
}
