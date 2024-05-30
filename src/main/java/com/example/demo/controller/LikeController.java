package com.example.demo.controller;

import com.example.demo.model.Like;
import com.example.demo.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/likes")
public class LikeController {

    @Autowired
    private LikeRepository likeRepository;

    @GetMapping
    public List<Like> getAllLikes() {
        return likeRepository.findAll();
    }

    @PostMapping
    public Like createLike(@RequestBody Like like) {
        return likeRepository.save(like);
    }

    @GetMapping("/{id}")
    public Like getLikeById(@PathVariable String id) {
        return likeRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Like updateLike(@PathVariable String id, @RequestBody Like like) {
        like.setLikeId(id);
        return likeRepository.save(like);
    }

    @DeleteMapping("/{id}")
    public void deleteLike(@PathVariable String id) {
        likeRepository.deleteById(id);
    }
}
