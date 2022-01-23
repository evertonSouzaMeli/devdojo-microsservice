package academy.devdojo.course.endpoint.service;

import academy.devdojo.core.model.Course;
import academy.devdojo.core.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class CourseService {
    private final CourseRepository courseRepository;


    public Iterable<Course> list(Pageable pageable){
        log.info("Listing All Courses");
        return courseRepository.findAll(pageable);
    }

}
