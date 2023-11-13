package com.example.demo.service;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
	@Autowired
    private TaskRepository repository;

    public Task saveTask(Task Task) {
        return repository.save(Task);
    }

    public List<Task> saveTasks(List<Task> Tasks) {
        return repository.saveAll(Tasks);
    }

    public List<Task> getTasks() {
        return repository.findAll();
    }

    public Task getTaskById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteTask(int id) {
        repository.deleteById(id);
        return "Task removed !! " + id;
    }

    public Task updateTask(int id, Task Task) {
        Task existingTask = repository.findById(id).orElse(null);
        existingTask.setTitle(Task.getTitle());
        existingTask.setDescription(Task.getDescription());
        existingTask.setCompleted(Task.getCompleted());
        return repository.save(existingTask);
    }
}
