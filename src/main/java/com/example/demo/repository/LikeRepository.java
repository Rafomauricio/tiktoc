package com.example.demo.repository;

import com.example.demo.model.Like;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LikeRepository extends MongoRepository<Like, String> {
}
