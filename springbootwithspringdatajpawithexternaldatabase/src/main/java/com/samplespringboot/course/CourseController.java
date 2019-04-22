package com.samplespringboot.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseService topicService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses() {
		return topicService.getAllCourses();
	}
	
	/*@RequestMapping("topics/{foo}") This also works.
	public Topic getTopic(@PathVariable("foo") String id) {
		return topicService.getTopic(id);
	}*/
	
	@RequestMapping("courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return topicService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/courses")
	public void addCourse(@RequestBody Course topic) {
		topicService.addCourse(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/courses/{id}")
	public void updateCourse(@RequestBody Course topic, @PathVariable String id) {
		topicService.updateCourse(topic,id);
	}	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		topicService.deleteCourse(id);
	}	
}
