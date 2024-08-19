package com.example.coursesapi.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String code;
    private String description;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<CourseInstance> instances;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public List<CourseInstance> getInstances() { return instances; }
    public void setInstances(List<CourseInstance> instances) { this.instances = instances; }
}
