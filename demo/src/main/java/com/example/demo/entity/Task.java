package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "task_table")
public class Task {
    @Id
    private int id;
    private String title;
    private String description;
    private Boolean completed;
}
