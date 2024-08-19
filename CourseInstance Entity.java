package com.example.coursesapi.model;

import javax.persistence.*;

@Entity
public class CourseInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int year;
    private int semester;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }

    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }
}
