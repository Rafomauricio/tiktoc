package com.example.demo.controller;

import com.example.demo.model.ViewHistory;
import com.example.demo.repository.ViewHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/view_history")
public class ViewHistoryController {

    @Autowired
    private ViewHistoryRepository viewHistoryRepository;

    @GetMapping
    public List<ViewHistory> getAllViewHistories() {
        return viewHistoryRepository.findAll();
    }

    @PostMapping
    public ViewHistory createViewHistory(@RequestBody ViewHistory viewHistory) {
        return viewHistoryRepository.save(viewHistory);
    }

    @GetMapping("/{id}")
    public ViewHistory getViewHistoryById(@PathVariable String id) {
        return viewHistoryRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public ViewHistory updateViewHistory(@PathVariable String id, @RequestBody ViewHistory viewHistory) {
        viewHistory.setViewId(id);
        return viewHistoryRepository.save(viewHistory);
    }

    @DeleteMapping("/{id}")
    public void deleteViewHistory(@PathVariable String id) {
        viewHistoryRepository.deleteById(id);
    }
}
