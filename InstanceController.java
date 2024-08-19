package com.example.coursesapi.controller;

import com.example.coursesapi.model.CourseInstance;
import com.example.coursesapi.service.InstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instances")
public class InstanceController {
    @Autowired
    private InstanceService instanceService;

    @PostMapping
    public CourseInstance createInstance(@RequestBody CourseInstance instance) {
        return instanceService.saveInstance(instance);
    }

    @GetMapping("/{year}/{semester}")
    public List<CourseInstance> getInstancesByYearAndSemester(@PathVariable int year, @PathVariable int semester) {
        return instanceService.getInstancesByYearAndSemester(year, semester);
    }

    @GetMapping("/{year}/{semester}/{courseId}")
    public CourseInstance getInstanceDetails(@PathVariable int year, @PathVariable int semester, @PathVariable Long courseId) {
        return instanceService.getInstanceDetails(year, semester, courseId);
    }

    @DeleteMapping("/{year}/{semester}/{courseId}")
    public void deleteInstance(@PathVariable int year, @PathVariable int semester, @PathVariable Long courseId) {
        CourseInstance instance = instanceService.getInstanceDetails(year, semester, courseId);
        instanceService.deleteInstance(instance.getId());
    }
}
