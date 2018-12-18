package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic(1, "topic1", "description1"),
				new Topic(2, "topic2", "description2"),
				new Topic(3, "topic3", "description3"),
				new Topic(4, "topic4", "description4")
				);
	}
	
	
	

}
