package com.example.demo.repository;

import com.example.demo.model.ViewHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ViewHistoryRepository extends MongoRepository<ViewHistory, String> {
}
