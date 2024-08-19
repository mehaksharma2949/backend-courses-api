package com.example.coursesapi.repository;

import com.example.coursesapi.model.CourseInstance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstanceRepository extends JpaRepository<CourseInstance, Long> {
    List<CourseInstance> findByYearAndSemester(int year, int semester);
    CourseInstance findByYearAndSemesterAndCourseId(int year, int semester, Long courseId);
}
