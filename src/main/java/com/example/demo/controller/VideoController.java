package com.example.demo.controller;

import com.example.demo.model.Video;
import com.example.demo.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideoController {

    @Autowired
    private VideoRepository videoRepository;

    @GetMapping
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    @PostMapping
    public Video createVideo(@RequestBody Video video) {
        return videoRepository.save(video);
    }

    @GetMapping("/{id}")
    public Video getVideoById(@PathVariable String id) {
        return videoRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Video updateVideo(@PathVariable String id, @RequestBody Video video) {
        video.setVideoId(id);
        return videoRepository.save(video);
    }

    @DeleteMapping("/{id}")
    public void deleteVideo(@PathVariable String id) {
        videoRepository.deleteById(id);
    }
}
