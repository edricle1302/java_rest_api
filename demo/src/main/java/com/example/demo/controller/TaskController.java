package com.example.demo.controller;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService service;

    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task Task) {
        return service.saveTask(Task);
    }

    @GetMapping("/tasks")
    public List<Task> findAllTasks() {
        return service.getTasks();
    }

    @GetMapping("/tasks/{id}")
    public Task findTaskById(@PathVariable int id) {
        return service.getTaskById(id);
    }

    @PutMapping("/tasks/{id}")
    public Task updateTask(@RequestBody Task Task) {
        return service.updateTask(Task);
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable int id) {
        return service.deleteTask(id);
    }
}
