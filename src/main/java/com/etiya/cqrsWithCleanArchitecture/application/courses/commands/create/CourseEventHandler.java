package com.etiya.cqrsWithCleanArchitecture.application.courses.commands.create;


import com.etiya.cqrsWithCleanArchitecture.domain.Course;
import com.etiya.cqrsWithCleanArchitecture.persistence.CourseRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.beans.Beans;

@Component
public class CourseEventHandler {

    private CourseRepository courseRepository;

    public CourseEventHandler(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @EventHandler
    public void on(CourseCreatedEvent courseCreatedEvent){
        Course course = new Course();
        BeanUtils.copyProperties(courseCreatedEvent,course);
        this.courseRepository.save(course);
    }

}
