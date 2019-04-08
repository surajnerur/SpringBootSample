package com.samplespringboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(new Topic("spring","springframework","spring framewrok desc"),
				new Topic("corejava","core java","core java desc"));
	}
}
