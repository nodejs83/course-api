package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicsService topicsService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicsService.getAllTopics();
	}
	
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable Integer id){
		return topicsService.getTopic(id);
	}
	
	

}
