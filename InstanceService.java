package com.example.coursesapi.service;

import com.example.coursesapi.model.CourseInstance;
import com.example.coursesapi.repository.InstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstanceService {
    @Autowired
    private InstanceRepository instanceRepository;

    public List<CourseInstance> getInstancesByYearAndSemester(int year, int semester) {
        return instanceRepository.findByYearAndSemester(year, semester);
    }

    public CourseInstance getInstanceDetails(int year, int semester, Long courseId) {
        return instanceRepository.findByYearAndSemesterAndCourseId(year, semester, courseId);
    }

    public CourseInstance saveInstance(CourseInstance instance) {
        return instanceRepository.save(instance);
    }

    public void deleteInstance(Long id) {
        instanceRepository.deleteById(id);
    }
}
