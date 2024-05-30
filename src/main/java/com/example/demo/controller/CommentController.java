package com.example.demo.controller;

import com.example.demo.model.Comment;
import com.example.demo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @GetMapping
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return commentRepository.save(comment);
    }

    @GetMapping("/{id}")
    public Comment getCommentById(@PathVariable String id) {
        return commentRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Comment updateComment(@PathVariable String id, @RequestBody Comment comment) {
        comment.setCommentId(id);
        return commentRepository.save(comment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable String id) {
        commentRepository.deleteById(id);
    }
}
